package strategyPattern

import strategyPattern.exceptions.NotSupportedOperationException
import utils.removeIfExists

class Calculator(
    operations: List<OperationStrategy>
) {

    private val enteredNumbers = mutableListOf<Number>()
    private val operations = mutableListOf<OperationStrategy>()

    init {
        this.operations.addAll(operations)
    }


    fun calculate(operationStrategy: OperationStrategy): Number {

        return if (operations.contains(operationStrategy)) {
            operationStrategy.calculate(enteredNumbers.toTypedArray())
        } else {
            throw NotSupportedOperationException("Not Supported Operation , Operation : ${operationStrategy::class.java}")
        }
    }

    fun enterNumber(number: Number) = enteredNumbers.add(number)

    fun deleteNumber(number: Number) = enteredNumbers.removeIf { it == number }

    fun cancelCalculation() = enteredNumbers.clear()

    fun addOperations(vararg operationStrategy: OperationStrategy){
        operations.addAll(operationStrategy)
    }
}
package strategyPattern.operations

import strategyPattern.OperationStrategy

object Summation  : OperationStrategy {

    override fun calculate(numbers: Array<out Number>): Number {
        var result = 0.0

        numbers.forEach {
            result += it.toDouble()
        }

        return result
    }

}
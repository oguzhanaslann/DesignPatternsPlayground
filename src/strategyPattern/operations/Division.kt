package strategyPattern.operations

import strategyPattern.OperationStrategy

object Division : OperationStrategy {

    override fun calculate(numbers: Array<out Number>): Number {
        var result : Double =  numbers.firstOrNull()?.toDouble() ?: 0.0


        numbers.forEachIndexed { index, number ->
            if (index != 0) {
                result /= number.toDouble()
            }
        }


        return result
    }



}
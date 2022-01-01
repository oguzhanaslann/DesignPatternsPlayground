package strategyPattern.calculatorExample

import strategyPattern.Strategy

interface OperationStrategy : Strategy {
    fun calculate(numbers: Array<out Number>) : Number
}
package strategyPattern

interface OperationStrategy : Strategy {
    fun calculate(numbers: Array<out Number>) : Number
}
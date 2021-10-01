package strategyPattern

import strategyPattern.operations.Division
import strategyPattern.operations.Multiplication
import strategyPattern.operations.Subtraction
import strategyPattern.operations.Summation

fun main() {
    val calculator = Calculator(
        listOf(
            Division,
            Subtraction,
            Summation,
            Multiplication
        )
    )


    calculator.enterNumber(1)
    calculator.enterNumber(1)
    println(calculator.calculate(Subtraction))
}
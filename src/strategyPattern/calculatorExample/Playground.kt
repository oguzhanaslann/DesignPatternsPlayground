package strategyPattern.calculatorExample

import strategyPattern.calculatorExample.operations.Division
import strategyPattern.calculatorExample.operations.Multiplication
import strategyPattern.calculatorExample.operations.Subtraction
import strategyPattern.calculatorExample.operations.Summation

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
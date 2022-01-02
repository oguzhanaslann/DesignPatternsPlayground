package decoratorPattern

fun main() {
    val originList = mutableListOf<String>(
        "a","b","c","d","e"
    )
    val decorator = UppercaseListDecorator(originList)

    println(decorator[1])
    println(decorator[0])

    val decoratedIterator = decorator.iterator()
    println("---------")
    while (decoratedIterator.hasNext()) {
        println(decoratedIterator.next())
    }

}
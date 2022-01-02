package decoratorPattern

class UppercaseListDecorator(
    private val list: List<String>
) : List<String> {

    override val size: Int
        get() = list.size

    override fun contains(element: String): Boolean = list.contains(element)

    override fun containsAll(elements: Collection<String>): Boolean = list.containsAll(elements)

    override fun get(index: Int): String = list[index].uppercase()

    override fun indexOf(element: String): Int = list.indexOf(element)

    override fun isEmpty(): Boolean = list.isEmpty()

    override fun iterator(): Iterator<String> = getIterator(list.iterator())

    private fun getIterator(iterator: Iterator<String>): Iterator<String> = object : Iterator<String> {
        override fun hasNext(): Boolean = iterator.hasNext()
        override fun next(): String = iterator.next().uppercase()
    }

    override fun lastIndexOf(element: String): Int = list.lastIndexOf(element)

    override fun listIterator(): ListIterator<String> = getListIterator(list.listIterator())

    override fun listIterator(index: Int): ListIterator<String> = getListIterator(list.listIterator(index))

    override fun subList(fromIndex: Int, toIndex: Int): List<String> = list.subList(fromIndex, toIndex)

    private fun getListIterator(listIterator: ListIterator<String>) = object : ListIterator<String> {
        override fun hasNext(): Boolean = listIterator.hasNext()
        override fun hasPrevious(): Boolean = listIterator.hasPrevious()
        override fun next(): String = listIterator.next().uppercase()
        override fun nextIndex(): Int = listIterator.nextIndex()
        override fun previous(): String = listIterator.previous().uppercase()
        override fun previousIndex(): Int = listIterator.previousIndex()
    }

}
package iteratorPattern

class RandomSongIterator(
    val list: Collection<Song>
) : PlaylistIterator {
    override fun hasPrev(): Boolean = list.isNotEmpty()

    override fun prev(): Song = list.random()

    override fun hasNext(): Boolean = list.isNotEmpty()

    override fun next(): Song = list.random()


}
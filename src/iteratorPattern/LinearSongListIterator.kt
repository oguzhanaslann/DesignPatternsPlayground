package iteratorPattern

class LinearSongListIterator(
    val list: List<Song>
) : PlaylistIterator {

    var currentPosition = -1

    override fun hasPrev(): Boolean = list.getOrNull(currentPosition - 1)?.let { true } ?: false

    override fun prev(): Song {
        currentPosition--
        return list[currentPosition]
    }

    override fun hasNext(): Boolean = list.getOrNull(currentPosition + 1)?.let { true } ?: false

    override fun next(): Song {
        currentPosition++
        return list[currentPosition]
    }
}
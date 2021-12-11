package iteratorPattern.playerExample

class Playlist(
    private val songIterator: PlaylistIterator
) {
    private var currentSong: Song? = null

    fun start() : Song? {
        if(songIterator.hasNext()){
            currentSong = songIterator.next()
        }
        return currentSong
    }

    fun next(): Song? {
        if(songIterator.hasNext()){
            currentSong = songIterator.next()
        }
        return currentSong
    }

    fun previous(): Song? {
        if(songIterator.hasPrev()){
            currentSong = songIterator.prev()
        }
        return currentSong
    }
}

interface PlaylistIterator : Iterator<Song> {
    fun hasPrev(): Boolean
    fun prev(): Song
}


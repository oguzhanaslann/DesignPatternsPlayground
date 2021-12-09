package iteratorPattern

fun main() {
    val songList = listOf(
        Song("A"),
        Song("B"),
        Song("C"),
        Song("D"),
        Song("E"),
        Song("F"),
        Song("G"),
        Song("H"),
        Song("I"),
    )
    val linearSongListIterator = LinearSongListIterator(songList)
    val playerSongList = Player(Playlist(linearSongListIterator))
    playerSongList.playSong()
    playerSongList.playNextSong()
    playerSongList.playNextSong()
    playerSongList.playPreviousSong()
    playerSongList.stopSong()

    println("--------------")

    val randomSongIterator = RandomSongIterator(songList)
    val playerSongRandom = Player(Playlist(randomSongIterator))
    playerSongRandom.playSong()
    playerSongRandom.playNextSong()
    playerSongRandom.playNextSong()
    playerSongRandom.playPreviousSong()
    playerSongRandom.stopSong()
}
package iteratorPattern.playerExample

class Player(
   private  val playlist: Playlist
) {
    private var currentSong : Song? = null

    fun playSong(){
        if (currentSong == null) {
            currentSong = playlist.start()
        }
        currentSong?.start()
    }

    fun playNextSong() {
        currentSong = playlist.next()
        currentSong?.start()
    }

    fun playPreviousSong(){
        currentSong = playlist.previous()
        currentSong?.start()
    }

    fun stopSong() {
        currentSong?.stop()
    }

}
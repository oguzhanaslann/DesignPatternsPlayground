package compositePattern;

import java.util.ArrayList;

public class PlayList {
    private SongComponent songComponent;

    public PlayList(SongComponent songComponent) {
        this.songComponent = songComponent;
    }

    public void printList() {
        songComponent.print();
    }

}

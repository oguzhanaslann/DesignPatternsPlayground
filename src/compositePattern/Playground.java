package compositePattern;

public class Playground {
    public static void main(String[] args) {
        SongComponent jazz = new SongGroup("Jazz description, I was too lazy to write long description here");
        jazz.add(
                new Song("jazz song -1 ","YU Band","18/10/2001")
        );

        jazz.add(
                new Song("jazz song -2 ","DU Band","18/10/2021")
        );


        SongComponent indieRock = new SongGroup("Indie rock description, I was too lazy to write long description here");
        indieRock.add(
                new Song("indieRock song -1 ","YU Band","15/07/2011")
        );

        indieRock.add(
                new Song("indieRock song -2 ","DU Band","13/11/2020")
        );

        SongComponent RnB = new SongGroup("RnB description, I was too lazy to write long description here");
        RnB.add(
                new Song("RnB song -1 ","YU Band","08/05/2011")
        );

        RnB.add(
                new Song("RnB song -2 ","DU Band","30/08/2020")
        );


        SongComponent allSongsList = new SongGroup("Song List every song available");
        allSongsList.add(jazz);
        allSongsList.add(indieRock);
        allSongsList.add(RnB);

        PlayList playList = new PlayList(allSongsList);
        playList.printList();
    }
}

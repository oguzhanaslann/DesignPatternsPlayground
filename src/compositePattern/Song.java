package compositePattern;

public class Song extends SongComponent{
    private String name,bandName,releaseDate ;

    public Song(String name, String bandName, String releaseDate) {
        this.name = name;
        this.bandName = bandName;
        this.releaseDate = releaseDate;
    }

    @Override
    public void print() {
        System.out.println(name + " by " + bandName + " in " + releaseDate);
    }
}

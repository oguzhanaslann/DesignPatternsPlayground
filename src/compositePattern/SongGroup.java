package compositePattern;

import java.util.ArrayList;

public class SongGroup extends SongComponent{
    private String description ;
    private ArrayList<SongComponent> songComponents = new ArrayList<>();

    public SongGroup(String description, ArrayList<SongComponent> songComponents) {
        this.description = description;
        this.songComponents = songComponents;
    }

    public SongGroup(String description) {
        this.description = description;
    }

    @Override
    public void add(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    @Override
    public void print() {
        System.out.println(description);
        System.out.println();
        songComponents.forEach((SongComponent::print));
        System.out.println();
    }


}

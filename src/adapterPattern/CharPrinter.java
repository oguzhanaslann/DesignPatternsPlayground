package adapterPattern;

public class CharPrinter {
    char characterToPrint;

    public void setCharacterToPrint(char characterToPrint) {
        this.characterToPrint = characterToPrint;
    }

    public void print() {
        System.out.println(characterToPrint);
    }

}

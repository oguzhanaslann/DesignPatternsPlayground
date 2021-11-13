package adapterPattern;

import java.util.ArrayList;

public class BufferedPrinter {
    public static final int BUFFER_SIZE = 3;
    private ArrayList<Character> buffer = new ArrayList<>(BUFFER_SIZE);

    public boolean buffer(char character) {
        if (buffer.size() < BUFFER_SIZE) {
            return buffer.add(character);
        } else {
            return false;
        }
    }

    public boolean isBufferEmpty() {
        return buffer.isEmpty();
    }

    public void print() {
        for (char bufferedChar : buffer) {
            System.out.print(bufferedChar);
        }
        buffer.clear();
        System.out.println();
    }


}

package iteratorPattern.computerLineExample;

import java.util.ArrayList;
import java.util.Iterator;

public class GamerComputerLineIterator implements Iterator<Computer> {

    private ArrayList<Computer> gamerComputers;
    private Iterator<Computer> iterator;

    public GamerComputerLineIterator(ArrayList<Computer> gamerComputers) {
        this.gamerComputers = gamerComputers;
        iterator = this.gamerComputers.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Computer next() {
        return iterator.next();
    }
}

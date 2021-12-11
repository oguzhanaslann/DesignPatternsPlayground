package iteratorPattern.computerLineExample;

import java.util.Iterator;

public class OfficeComputerLineIterator implements Iterator<Computer> {

    Computer[] computers;

    int currentIndex = 0;
    Computer currentItem = null;


    public OfficeComputerLineIterator(Computer[] computers) {
        this.computers = computers;
    }

    @Override
    public boolean hasNext() {
        return computers.length > 0 && computers.length > (currentIndex + 1 );
    }

    @Override
    public Computer next() {
        currentItem = computers[currentIndex];
        currentIndex++;
        return currentItem;
    }
}

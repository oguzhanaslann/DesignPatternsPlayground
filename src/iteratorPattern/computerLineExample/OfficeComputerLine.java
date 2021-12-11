package iteratorPattern.computerLineExample;

import java.util.Iterator;

public class OfficeComputerLine implements ComputerLine {
    public static final int BAND_WIDTH = 5;

    @Override
    public Iterator<Computer> getComputers() {
        return new OfficeComputerLineIterator(
                getOfficeComputersArray()
        );
    }

    public Computer[] getOfficeComputersArray() {
        Computer[] computers = new Computer[BAND_WIDTH];
        for (int i = 0; i < BAND_WIDTH; i++) {
            computers[i] = new OfficeComputer();
        }
        return computers;
    }
}

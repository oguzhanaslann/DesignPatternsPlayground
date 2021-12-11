package iteratorPattern.computerLineExample;

import java.util.ArrayList;
import java.util.Iterator;

public class GamerComputerLine implements ComputerLine {
    private final ArrayList<Computer> gamerComputers = new ArrayList<>();

    public GamerComputerLine(int computerCountToBuild) {
        fillGamerComputersList(computerCountToBuild);
    }

    private void fillGamerComputersList(int computerCountToBuild) {
        for (int i = 0; i < computerCountToBuild; i++) {
            gamerComputers.add(
                    new GamerComputer()
            );
        }
    }

    @Override
    public Iterator<Computer> getComputers() {
        return new GamerComputerLineIterator(gamerComputers);
    }

}

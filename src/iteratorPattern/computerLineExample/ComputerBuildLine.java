package iteratorPattern.computerLineExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ComputerBuildLine {

    private ArrayList<ComputerLine> computerLines;

    public ComputerBuildLine(ArrayList<ComputerLine> computerLines) {
        this.computerLines = computerLines;
    }

    public void runLine() {
        for (ComputerLine line : computerLines) {
            buildComputer(line.getComputers());
        }
    }

    private void buildComputer(Iterator<Computer> computerIterator) {
        while (computerIterator.hasNext()) {
            System.out.println("----Building----");
            Computer computer = computerIterator.next();
            computer.build();
            System.out.println("----------------");
        }
    }


}

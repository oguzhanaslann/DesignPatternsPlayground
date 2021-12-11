package iteratorPattern.computerLineExample;

import java.util.ArrayList;

public class Playground {
    public static void main(String[] args) {
        GamerComputerLine gamerComputerLine = new GamerComputerLine(5);
        OfficeComputerLine officeComputerLine = new OfficeComputerLine();

        ArrayList<ComputerLine> computerLines = new ArrayList<>();
        computerLines.add(gamerComputerLine);
        computerLines.add(officeComputerLine);


        ComputerBuildLine computerBuildLine = new ComputerBuildLine(computerLines);
        computerBuildLine.runLine();
    }
}

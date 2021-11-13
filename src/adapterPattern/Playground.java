package adapterPattern;

import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text : ");
        String textToPrint = scanner.nextLine();
        System.out.println("Enter printerType : ");
        String printerType = scanner.nextLine();

        Printer printer = null;

        switch (printerType) {
           case  "buffer" -> {
                printer = new BufferedPrinterAdapter(new BufferedPrinter());
            }

            case "char" -> {
                printer = new CharPrinterAdapter(new CharPrinter());
            }

            default -> {

            }
        }

        if (printer != null) {
            printer.setTextToBePrinted(textToPrint);
            printer.print();
        }



    }
}

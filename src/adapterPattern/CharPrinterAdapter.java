package adapterPattern;

public class CharPrinterAdapter implements Printer{
    private String textToBePrinted;
    private CharPrinter charPrinter;

    public CharPrinterAdapter( CharPrinter charPrinter,String textToBePrinted) {
        this.textToBePrinted = textToBePrinted;
        this.charPrinter = charPrinter;
    }

    public CharPrinterAdapter(CharPrinter charPrinter) {
        this.charPrinter = charPrinter;
    }

    @Override
    public void setTextToBePrinted(String text) {
        this.textToBePrinted = text;
    }

    @Override
    public void print() {
        System.out.println("Printing...");

        for (int i = 0; i < textToBePrinted.length(); i++) {
            char letter = textToBePrinted.charAt(i);
            charPrinter.setCharacterToPrint(letter);
            charPrinter.print();
        }
    }
}

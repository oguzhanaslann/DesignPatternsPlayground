package adapterPattern;

public class BufferedPrinterAdapter implements Printer{
    private BufferedPrinter bufferedPrinter;
    private String textToBePrinted;

    public BufferedPrinterAdapter(BufferedPrinter bufferedPrinter, String textToBePrinted) {
        this.bufferedPrinter = bufferedPrinter;
        this.textToBePrinted = textToBePrinted;
    }

    public BufferedPrinterAdapter(BufferedPrinter bufferedPrinter) {
        this.bufferedPrinter = bufferedPrinter;
    }

    @Override
    public void setTextToBePrinted(String textToBePrinted) {
        this.textToBePrinted = textToBePrinted;
    }

    @Override
    public void print() {
        System.out.println("Printing...");
        for (int i = 0; i < textToBePrinted.length(); i++) {
            char letter = textToBePrinted.charAt(i);
            emptyBufferOfPrinterThenBuffer(letter);

        }

        boolean isThereAnythingToPrint = !bufferedPrinter.isBufferEmpty();

        if (isThereAnythingToPrint){
            bufferedPrinter.print();
        }

    }

    private void emptyBufferOfPrinterThenBuffer(char letter) {
        while (!bufferedPrinter.buffer(letter)) {
            bufferedPrinter.print();
        }
    }

}

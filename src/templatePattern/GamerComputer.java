package templatePattern;

public class GamerComputer extends Computer{
    @Override
    protected void plugCPU() {
        System.out.println("Putting high-end multi-core cpu");
    }

    @Override
    protected void plugMemory() {
        System.out.println("Putting high clock memory");
    }

    @Override
    protected void plugStorage() {
        System.out.println("Putting ssd storage");
    }
}

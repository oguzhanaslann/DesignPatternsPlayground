package templatePattern;

public abstract class Computer {
    public final void build() {
        plugCPU();
        plugMemory();
        plugStorage();
        plugPeripherals();
    }

    protected abstract void plugCPU();

    protected abstract void plugMemory();

    protected abstract void plugStorage();

    private void plugPeripherals(){
        System.out.println("Connecting mouse,keyboard and monitor");
    }
}

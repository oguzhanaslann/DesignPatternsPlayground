package templatePattern;

public class OfficeComputer extends  Computer{
    @Override
    protected void plugCPU() {
        System.out.println("Putting low-end dual-core cpu");
    }

    @Override
    protected void plugMemory() {
        System.out.println("Putting energy efficient memory");
    }

    @Override
    protected void plugStorage() {
        System.out.println("Putting energy efficient hdd  ");
    }
}

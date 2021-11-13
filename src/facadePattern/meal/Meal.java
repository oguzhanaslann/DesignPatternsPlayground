package facadePattern.meal;

public enum Meal {
    NapoletanaPizza("Napoletana Pizza"),
    MargheritaPizza("Margherita Pizza"),
    MarinaraPizza("Marinara Pizza"),
    ChicagoStylePizza("ChicagoStyle Pizza");

    private String name;

    Meal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

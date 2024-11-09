public class Computer {
    private String brand;
    private String model;
    private Component[] components;

    public Computer(String brand, String model, Component[] components) {
    	super();
        this.brand = brand;
        this.model = model;
        this.components = components;
    }

    public void displayComputerDetails() {
        System.out.println("Computer Details:");
        System.out.println("-----------------");
        System.out.println(" Brand: " + brand);
        System.out.println(" Model: " + model);

        System.out.println("\nInstalled Components:");
        System.out.println("----------------------");
        for (Component component : components) {
            component.displayComponentDetails();
            System.out.println();
        }
    }
}

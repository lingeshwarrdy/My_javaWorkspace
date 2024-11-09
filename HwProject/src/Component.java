public class Component {
    String componentName;
    String manufacturer;
    String specs;

    public Component(String componentName, String manufacturer, String specs) {
    	super();
        this.componentName = componentName;
        this.manufacturer = manufacturer;
        this.specs = specs;
    }

    public void displayComponentDetails() {
        System.out.println(" Component: " + componentName);
        System.out.println(" Manufacturer: " + manufacturer);
        System.out.println(" Specifications: " + specs);
    }
}

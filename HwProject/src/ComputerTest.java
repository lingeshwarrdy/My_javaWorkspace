public class ComputerTest {
    public static void main(String[] args) {
        // Create Component objects
        Component cpu = new Component("CPU", "Intel", "Core i7 3.8 GHz");
        Component ram = new Component("RAM", "Micron", "16GB DDR4");
        Component storage = new Component("Storage", "Samsung", "1TB SSD");
        Component gpu = new Component("GPU", "NVIDIA", "GeForce RTX 3060");

        // Array of components for the computer
        Component[] components = { cpu, ram, storage, gpu };

        // Create a Computer object
        Computer computer = new Computer("Dell", "XPS 15", components);

        // Display Computer details along with components
        computer.displayComputerDetails();
    }
}

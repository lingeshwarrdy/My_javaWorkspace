class Animal {
    String name;

    // Constructor of Animal class
    public Animal(String name) {
        this.name = name;  // 'this' refers to the current instance of Animal
    }

    // Method of Animal class
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    String breed;

    // Constructor of Dog class
    public Dog(String name, String breed) {
        super(name);  // Calls the constructor of the parent class (Animal)
        this.breed = breed;  // 'this' refers to the current instance of Dog
    }

    // Method of Dog class
    @Override
    public void sound() {
        super.sound();  // Calls the sound method from the parent class (Animal)
        System.out.println("Woof! Woof!");  // Additional behavior in Dog class
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);  // 'this' refers to current Dog's name
        System.out.println("Breed: " + this.breed);
    }
}

/*public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayInfo();  // Output: Name: Buddy, Breed: Golden Retriever
        myDog.sound();  // Output: Some generic animal sound, Woof! Woof!
    }
}*/

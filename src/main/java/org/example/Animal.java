package org.example;

import java.util.ArrayList; // Importing ArrayList to store Animal objects
import java.util.Scanner; // Importing Scanner to read user input

class Animal {
    private String name; // Attribute to store the name of the animal
    private boolean isDog; // Attribute to store if the animal is a dog or not

    // Constructor to initialize Animal object with name and isDog attributes
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter method to retrieve the name of the animal
    public String getName() {
        return name;
    }

    // Getter method to check if the animal is a dog
    public boolean isDog() {
        return isDog;
    }

    // Overriding toString() method to return a string representation of the Animal object
    @Override
    public String toString() {
        return "Animal{name='" + getName() + "', isDog=" + isDog() + "}";
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        ArrayList<Animal> animals = new ArrayList<>(); // Creating an ArrayList to store Animal objects

        while (true) {
            System.out.print("Enter animal name: ");
            String name = scanner.nextLine(); // Reading the animal name from user input
            if (name.isEmpty()) {
                break; // If the input is empty, break the loop
            }
            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = Boolean.parseBoolean(scanner.nextLine()); // Reading if the animal is a dog from user input
            animals.add(new Animal(name, isDog)); // Adding a new Animal object to the list
        }

        System.out.println("Animals entered:");
        for (Animal animal : animals) {
            System.out.println(animal); // Printing each Animal object using the overridden toString() method
        }
    }
}
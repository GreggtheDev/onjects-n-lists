package org.example;

import java.util.ArrayList;
import java.util.Scanner;

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

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

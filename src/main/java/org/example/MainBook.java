package org.example;

import java.util.ArrayList; // Importing ArrayList to store Book objects
import java.util.Scanner; // Importing Scanner to read user input

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        ArrayList<Book> books = new ArrayList<>(); // Creating an ArrayList to store Book objects

        while (true) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine(); // Reading the book title from user input
            if (title.isEmpty()) {
                break; // If the input is empty, break the loop
            }
            System.out.print("Enter number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine()); // Reading the number of pages from user input
            System.out.print("Enter publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine()); // Reading the publication year from user input
            books.add(new Book(title, numberOfPages, publicationYear)); // Adding a new Book object to the list
        }

        System.out.print("What would you like to print (everything/name): ");
        String choice = scanner.nextLine(); // Reading the user's choice

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book); // Printing each Book object using the overridden toString() method
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle()); // Printing only the titles of the books
            }
        }
    }
}


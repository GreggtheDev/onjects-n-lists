package org.example; 

public class Book {
    private String title; // Attribute to store the title of the book
    private int numberOfPages; // Attribute to store the number of pages
    private int publicationYear; // Attribute to store the publication year

    // Constructor to initialize Book object with title, numberOfPages, and publicationYear attributes
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Getter method to retrieve the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Getter method to retrieve the publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Overriding toString() method to return a string representation of the Book object
    @Override
    public String toString() {
        return "Book{title='" + getTitle() + "', numberOfPages=" + getNumberOfPages() + ", publicationYear=" + getPublicationYear() + "}";
    }
}

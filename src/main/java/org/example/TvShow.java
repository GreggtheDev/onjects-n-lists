package org.example;

import java.util.ArrayList; // Importing ArrayList to store TvShow objects
import java.util.Scanner; // Importing Scanner to read user input

class TvShow {
    private String showName; // Attribute to store the name of the TV show
    private int numberOfEpisodes; // Attribute to store the number of episodes
    private String genre; // Attribute to store the genre of the TV show

    // Constructor to initialize TvShow object with showName, numberOfEpisodes, and genre attributes
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter method to retrieve the name of the TV show
    public String getShowName() {
        return showName;
    }

    // Getter method to retrieve the number of episodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter method to retrieve the genre of the TV show
    public String getGenre() {
        return genre;
    }

    public class MainTvShow {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
            ArrayList<TvShow> tvShows = new ArrayList<>(); // Creating an ArrayList to store TvShow objects

            while (true) {
                System.out.print("Enter TV show name: ");
                String showName = scanner.nextLine(); // Reading the TV show name from user input
                if (showName.isEmpty()) {
                    break; // If the input is empty, break the loop
                }
                System.out.print("Enter number of episodes: ");
                int numberOfEpisodes = Integer.parseInt(scanner.nextLine()); // Reading the number of episodes from user input
                System.out.print("Enter genre: ");
                String genre = scanner.nextLine(); // Reading the genre from user input
                tvShows.add(new TvShow(showName, numberOfEpisodes, genre)); // Adding a new TvShow object to the list
            }

            System.out.println("TV Shows entered:");
            for (TvShow tvShow : tvShows) {
                System.out.println(tvShow); // Printing each TvShow object using the overridden toString() method
            }
        }
package org.example;

public class TvShow {
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

    // Overriding toString() method to return a string representation of the TvShow object
    @Override
    public String toString() {
        return "TvShow{showName='" + getShowName() + "', numberOfEpisodes=" + getNumberOfEpisodes() + ", genre='" + getGenre() + "'}";
    }
}

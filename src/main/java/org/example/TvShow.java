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
package com.java.oops;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    String name;
    int ratings;     // Ratings out of 10
    int collections; // Collections in millions of dollars
    int profit;      // Profit in millions of dollars
    String actor;
    String actress;

    // Constructor to initialize movie details
    public Movies(String name, int ratings, int collections, int profit, String actor, String actress) {
        this.name = name;
        this.ratings = ratings;
        this.collections = collections;
        this.profit = profit;
        this.actor = actor;
        this.actress = actress;
    }

    // Method to print movie details
    void printMovieDetails() {
        System.out.printf("%-20s | %-7s | %-15s | %-10s | %-15s | %-15s\n", "Name", "Ratings", "Collections", "Profit", "Actor", "Actress");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-20s | %-7d | %-15d | %-10d | %-15s | %-15s\n", name, ratings, collections, profit, actor, actress);
    }

    // Method to print a list of movies
    static void printMoviesList(List<Movies> moviesList) {
        System.out.printf("%-20s | %-7s | %-15s | %-10s | %-15s | %-15s\n", "Name", "Ratings", "Collections", "Profit", "Actor", "Actress");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (Movies movie : moviesList) {
            System.out.printf("%-20s | %-7d | %-15d | %-10d | %-15s | %-15s\n", movie.name, movie.ratings, movie.collections, movie.profit, movie.actor, movie.actress);
        }
    }

    public static void main(String[] args) {
        // Creating movie instances
        Movies movie1 = new Movies("Inception", 9, 830, 700, "Leonardo DiCaprio", "Ellen Page");
        Movies movie2 = new Movies("Titanic", 8, 2200, 1500, "Leonardo DiCaprio", "Kate Winslet");
        Movies movie3 = new Movies("The Dark Knight", 9, 1000, 800, "Christian Bale", "Maggie Gyllenhaal");

        // Creating a list of movies
        List<Movies> moviesList = new ArrayList<>();
        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);

//        Printing individual movie details
//        movie1.printMovieDetails();
//        System.out.println();
//        movie2.printMovieDetails();
//        System.out.println();
//        movie3.printMovieDetails();
//        System.out.println();

        // Printing all movies in the list
        printMoviesList(moviesList);
    }
}

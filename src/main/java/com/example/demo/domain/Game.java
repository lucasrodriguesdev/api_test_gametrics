package com.example.demo.domain;

public class Game {
    private final String id;
    private String name;
    private String releaseDate;
    private Double rating;

    public Game(String id, String name, String releaseDate, Double rating) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}

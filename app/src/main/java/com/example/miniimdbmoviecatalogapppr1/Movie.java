package com.example.miniimdbmoviecatalogapppr1;

import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private double rating;
    private int posterResId;
    private String description;
    private List<Actor> actors;
    private boolean isFavorite;
    private float userRating;

    public Movie(String title, String genre, double rating, int posterResId, String description, List<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.posterResId = posterResId;
        this.description = description;
        this.actors = actors;
        this.isFavorite = false;
        this.userRating = 0;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public int getPosterResId() { return posterResId; }
    public String getDescription() { return description; }
    public List<Actor> getActors() { return actors; }
    public boolean isFavorite() { return isFavorite; }
    public void setFavorite(boolean favorite) { isFavorite = favorite; }
    public float getUserRating() { return userRating; }
    public void setUserRating(float userRating) { this.userRating = userRating; }
}
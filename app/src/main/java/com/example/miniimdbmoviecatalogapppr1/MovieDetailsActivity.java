package com.example.miniimdbmoviecatalogapppr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView posterImageView;
    private TextView titleTextView, genreTextView, ratingTextView, descriptionTextView;
    private RatingBar ratingBar, userRatingBar;
    private ImageButton favoriteButton;
    private RecyclerView actorsRecyclerView;
    private Movie movie;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        position = getIntent().getIntExtra("position", 0);
        movie = MovieData.getMovies().get(position);

        posterImageView = findViewById(R.id.detailPoster);
        titleTextView = findViewById(R.id.detailTitle);
        genreTextView = findViewById(R.id.detailGenre);
        ratingTextView = findViewById(R.id.detailRating);
        descriptionTextView = findViewById(R.id.detailDescription);
        ratingBar = findViewById(R.id.detailRatingBar);
        userRatingBar = findViewById(R.id.userRatingBar);
        favoriteButton = findViewById(R.id.favoriteButton);
        actorsRecyclerView = findViewById(R.id.actorsRecyclerView);

        posterImageView.setImageResource(movie.getPosterResId());
        titleTextView.setText(movie.getTitle());
        genreTextView.setText(movie.getGenre());
        ratingTextView.setText("Rating: " + movie.getRating() + "/10");
        descriptionTextView.setText(movie.getDescription());
        ratingBar.setRating((float) movie.getRating() / 2);

        updateFavoriteButton();

        favoriteButton.setOnClickListener(v -> {
            movie.setFavorite(!movie.isFavorite());
            updateFavoriteButton();
        });

        userRatingBar.setRating(movie.getUserRating());
        userRatingBar.setOnRatingBarChangeListener((bar, rating, fromUser) -> {
            if (fromUser) {
                movie.setUserRating(rating);
            }
        });

        ActorAdapter actorAdapter = new ActorAdapter(this, movie.getActors());
        actorsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        actorsRecyclerView.setAdapter(actorAdapter);
    }

    private void updateFavoriteButton() {
        if (movie.isFavorite()) {
            favoriteButton.setImageResource(android.R.drawable.btn_star_big_on);
        } else {
            favoriteButton.setImageResource(android.R.drawable.btn_star_big_off);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
package com.example.miniimdbmoviecatalogapppr1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private Context context;
    private List<Movie> movieList;
    private List<Movie> movieListFull;

    public MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
        this.movieListFull = new ArrayList<>(movieList);
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.titleTextView.setText(movie.getTitle());
        holder.genreTextView.setText(movie.getGenre());
        holder.ratingBar.setRating((float) movie.getRating() / 2);
        holder.ratingTextView.setText(String.valueOf(movie.getRating()));
        holder.posterImageView.setImageResource(movie.getPosterResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, MovieDetailsActivity.class);
            intent.putExtra("position", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public void filter(String text) {
        movieList.clear();
        if (text.isEmpty()) {
            movieList.addAll(movieListFull);
        } else {
            text = text.toLowerCase();
            for (Movie movie : movieListFull) {
                if (movie.getTitle().toLowerCase().contains(text)) {
                    movieList.add(movie);
                }
            }
        }
        notifyDataSetChanged();
    }

    public void updateList(List<Movie> newList) {
        movieList = newList;
        movieListFull = new ArrayList<>(newList);
        notifyDataSetChanged();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        ImageView posterImageView;
        TextView titleTextView, genreTextView, ratingTextView;
        RatingBar ratingBar;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            posterImageView = itemView.findViewById(R.id.moviePoster);
            titleTextView = itemView.findViewById(R.id.movieTitle);
            genreTextView = itemView.findViewById(R.id.movieGenre);
            ratingBar = itemView.findViewById(R.id.movieRatingBar);
            ratingTextView = itemView.findViewById(R.id.movieRating);
        }
    }
}
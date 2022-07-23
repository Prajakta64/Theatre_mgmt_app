package com.upgrad.movieapp.Services;

import java.util.List;

import com.upgrad.movieapp.entities.Movie;

public interface MovieService {
	
	public Movie acceptMovieDetails(Movie movie);
	
	public Movie getMovieDetailsById(int id);
	
	public List<Movie> getAllMovies();
	
	public Movie updateMovieDetails(Movie movie);
	
	public boolean removeMovie(int id);

}

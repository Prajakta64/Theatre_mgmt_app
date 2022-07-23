package com.upgrad.movieapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrad.movieapp.Dao.MovieDao;
import com.upgrad.movieapp.entities.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;
	
	
	@Override
	public Movie acceptMovieDetails(Movie movie) {
		return movieDao.save(movie);
	}

	@Override
	public Movie getMovieDetailsById(int id) {
		return movieDao.findById(id).get();
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieDao.findAll();
	}

	@Override
	public boolean removeMovie(int id) {
		Movie searchedMovie = movieDao.findById(id).get();
		if(searchedMovie == null)
			return false;
		else
			movieDao.delete(searchedMovie);
			return true;
	}

	@Override
	public Movie updateMovieDetails(Movie movie) {
		Movie searchedMovie = movieDao.findById(movie.getMovieId()).get();
		
		if(searchedMovie == null) {
			System.out.println("Movie not found");
		}
		else {
			searchedMovie.setCoverPhotoURL(movie.getCoverPhotoURL());
			searchedMovie.setDuration(movie.getDuration());
			searchedMovie.setMovieDesc(movie.getMovieDesc());
			searchedMovie.setMovieId(movie.getMovieId());
			searchedMovie.setMovieName(movie.getMovieName());
			searchedMovie.setReleaseDate(movie.getReleaseDate());
			searchedMovie.setStatusId(movie.getStatusId());
			searchedMovie.setTrailerURL(movie.getTrailerURL());
			
			movieDao.save(searchedMovie);
			
		}
		return searchedMovie;
		 
	}

}

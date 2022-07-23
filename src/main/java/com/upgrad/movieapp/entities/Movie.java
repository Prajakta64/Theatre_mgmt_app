package com.upgrad.movieapp.entities;

import java.time.LocalDateTime;
import java.util.Objects;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="movie_id", length=10, nullable= false)
	private int movieId;
	
	@Column(name="movie_name", length=50, nullable= false)
	private String movieName;
	
	@Column(name="movie_desc", length=500, nullable= false)
	private String movieDesc;
	
	@Column(name="release_date", nullable= false)
	private LocalDateTime releaseDate;
	
	@Column(name="duration", length=3, nullable= false)
	private int duration;
	
	@Column(name="cover_photo_url", length=500, nullable= false)
	private String coverPhotoURL;
	
	@Column(name="trailer_url", length=500, nullable= false)
	private String trailerURL;
	
	@Column(name="status_id", length=10, nullable= false)
	private int statusId;
	
	/*
	 * @OneToOne(mappedBy = "theatre_id") private Theatre theatre;
	 */
	
	
	// getter and setter methods
	

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		if(duration>60) {
		this.duration = duration;
		} else {
			System.out.println("duration must be more than 60 min");
		}
	}

	public String getCoverPhotoURL() {
		return coverPhotoURL;
	}

	public void setCoverPhotoURL(String coverPhotoURL) {
		this.coverPhotoURL = coverPhotoURL;
	}

	public String getTrailerURL() {
		return trailerURL;
	}

	public void setTrailerURL(String trailerURL) {
		this.trailerURL = trailerURL;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coverPhotoURL, duration, movieDesc, movieId, movieName, releaseDate, statusId, trailerURL);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(coverPhotoURL, other.coverPhotoURL) && duration == other.duration
				&& Objects.equals(movieDesc, other.movieDesc) && movieId == other.movieId
				&& Objects.equals(movieName, other.movieName) && Objects.equals(releaseDate, other.releaseDate)
				&& statusId == other.statusId && Objects.equals(trailerURL, other.trailerURL);
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDesc=" + movieDesc + ", releaseDate="
				+ releaseDate + ", duration=" + duration + ", coverPhotoURL=" + coverPhotoURL + ", trailerURL="
				+ trailerURL + ", statusId=" + statusId + "]";
	}
	

	
	

}

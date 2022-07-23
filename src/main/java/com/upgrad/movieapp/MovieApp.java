package com.upgrad.movieapp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.upgrad.movieapp.Dao.CityDao;
import com.upgrad.movieapp.Dao.CustomerDao;
import com.upgrad.movieapp.Dao.MovieDao;
import com.upgrad.movieapp.Dao.TheatreDao;
import com.upgrad.movieapp.Services.MovieService;
import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Customer;
import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.entities.Theatre;

@SpringBootApplication
public class MovieApp implements CommandLineRunner {


	@Autowired
	private MovieDao movieDao;

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(MovieApp.class, args);
		
		MovieService movieService = (MovieService)context.getBean("movieServiceImpl");


		/*
		 * CustomerDao customerDao = context.getBean(CustomerDao.class);
		 * 
		 * Customer customer = new Customer(); customer.setFirstName("Prajakta2");
		 * customer.setCustomerId(1); customer.setUserName("praju98");
		 * customer.setPassword("abvdef");
		 * 
		 * customerDao.save(customer);
		 * 
		 * System.out.println(customer);
		 * 
		 * Customer customer1 = customerDao.findById(4); System.out.println(customer1);
		 */

		//MovieDao movieDao = context.getBean(MovieDao.class);
		
		  Movie movie1 = new Movie(); movie1.setCoverPhotoURL("https://photo.com");
		  movie1.setDuration(70); movie1.setMovieDesc("Action movie");
		  movie1.setMovieId(1); movie1.setMovieName("Mirchi");
		  movie1.setReleaseDate(LocalDateTime.now()); movie1.setStatusId(0);
		  movie1.setTrailerURL("https://trailer.com");
		  
		  movieService.acceptMovieDetails(movie1);
		 

		//System.out.println(movie1);
		

		/*
		 * City city = new City(); city.setCityId(1); city.setCityName("Dombivli");
		 * 
		 * CityDao cityDao = context.getBean(CityDao.class); cityDao.save(city);
		 * 
		 * //create Theatre objects Theatre theatre1 = new Theatre(1, "Gopi",city );
		 * Theatre theatre2 = new Theatre(1, "Tilak" , city);
		 * 
		 * TheatreDao TDao = context.getBean(TheatreDao.class);
		 * 
		 * Set<Theatre> theatres = new HashSet<>(); theatres.add(theatre1);
		 * theatres.add(theatre2);
		 * 
		 * TDao.saveAll(theatres);
		 * 
		 * List<Theatre> theatres1 = TDao.findAll();
		 */
		/*
		 * Iterator<Theatre> itr = theatres1.listIterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next().toString()); }
		 */
		
		//theatres1.forEach(Theatre -> System.out.println(Theatre.toString()));
 
		
		Iterator itr = movieService.getAllMovies().listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			String s1 = "prajakta";
			s1 = "prajakta2";
			
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie movie2 = movieDao.findById(11).orElse(null);
		System.out.println(movie2);
	}

}


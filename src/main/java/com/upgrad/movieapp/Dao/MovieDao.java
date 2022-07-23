package com.upgrad.movieapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upgrad.movieapp.entities.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

}

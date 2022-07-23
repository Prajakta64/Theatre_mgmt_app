package com.upgrad.movieapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upgrad.movieapp.entities.City;


@Repository
public interface CityDao extends JpaRepository<City, Integer> {

}

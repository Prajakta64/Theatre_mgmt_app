package com.upgrad.movieapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upgrad.movieapp.entities.Theatre;

public interface TheatreDao extends JpaRepository<Theatre, Integer> {

}

package com.roulette.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.roulette.model.Roulette;


@Repository
public interface RepositoryMain extends CrudRepository<Roulette, Long>{

}

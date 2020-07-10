package com.system.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.restaurant.model.Plates;

public interface PlatesRepository  extends JpaRepository<Plates, Long>{
	
}
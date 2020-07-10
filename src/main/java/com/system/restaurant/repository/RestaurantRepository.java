package com.system.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.restaurant.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	
	
}

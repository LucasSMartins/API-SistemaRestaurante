package com.system.restaurant.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.restaurant.model.Restaurant;
import com.system.restaurant.repository.RestaurantRepository;

@RestController
@RequestMapping(value = "/api")
public class RestaurantResource {

	@Autowired
	RestaurantRepository restaurantRepository;

	@GetMapping("/restaurant") /* metodo lista */
	public List<Restaurant> listaRestaurant() {
		return restaurantRepository.findAll();
	}
	@GetMapping("/restaurant/{id}")/* metodo lista de produto unico*/
	public Optional<Restaurant> listaProdutoUnico(@PathVariable(value="id")Long id){
		return restaurantRepository.findById(id);
	}	
	
	@PostMapping("/restaurant")/*salvar o produto */
	public void salvaRestaurant(@RequestBody Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
	
	@DeleteMapping("/restaurant")/* deleta o produto*/
	public void DeletaRestaurant(@RequestBody Restaurant restaurant) {
		restaurantRepository.delete(restaurant);
	}
	@PutMapping("/restaurant")/* atualiza o produto*/
	public Restaurant atualizaRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}
}

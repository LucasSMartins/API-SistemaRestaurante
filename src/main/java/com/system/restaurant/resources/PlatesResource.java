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

import com.system.restaurant.model.Plates;
import com.system.restaurant.repository.PlatesRepository;

@RestController
@RequestMapping(value = "/api")
public class PlatesResource {

	@Autowired
	PlatesRepository platesRepository;
	
	@GetMapping("/plates") /* metodo lista */
	public List<Plates> listaPlates() {
		return platesRepository.findAll();
	}
	@GetMapping("/plates/{id}")/* metodo lista de produto unico*/
	public Optional<Plates> listaProdutoUnico(@PathVariable(value="id")Long id){
		return platesRepository.findById(id);
	}	
	
	@PostMapping("/plates")/*salvar o produto */
	public void salvaPlates(@RequestBody Plates plates) {
		platesRepository.save(plates);
	}
	
	@DeleteMapping("/plates")/* deleta o produto*/
	public void DeletaPlates(@RequestBody Plates plates) {
		platesRepository.delete(plates);
	}
	@PutMapping("/plates")/* atualiza o produto*/
	public Plates atualizaPlates(@RequestBody Plates plates) {
		return platesRepository.save(plates);
	}
}
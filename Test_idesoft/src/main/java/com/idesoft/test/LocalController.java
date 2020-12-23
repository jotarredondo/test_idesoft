package com.idesoft.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.idesoft.test.model.Local;
import com.idesoft.test.service.LocalService;

@RestController
@RequestMapping("/api/v1/local")
public class LocalController {
	
	@Autowired
	LocalService localService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Local> findAll() {
		return localService.findAll();
	}
	
	@GetMapping("/{comuna}")
	@ResponseStatus(HttpStatus.OK)
	public List<Local> findByComuna(@PathVariable String comuna) {
		return localService.findByComuna(comuna);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void update (@RequestBody Local local) {
		localService.update(local);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create (@RequestBody Local local) {
		localService.save(local);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete (@PathVariable Integer id) {
		localService.delete(id);
		}
}

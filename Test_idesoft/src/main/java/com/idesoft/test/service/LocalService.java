package com.idesoft.test.service;

import java.util.List;

import com.idesoft.test.model.Local;

public interface LocalService {
	
	public List<Local> findAll(); 
	
	public List<Local> findByComuna(String comuna);
	
	public Local findById(Integer id);
	
	public void save (Local local);
	
	public void update (Local local);
	
	public void delete (Local local);

}

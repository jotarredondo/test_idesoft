package com.idesoft.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.idesoft.test.model.Local;

@SpringBootTest
class TestIdesoftApplicationTests {

	List<Local> localesTest = new ArrayList<Local>();
	Local local = new Local();
	
	@Before
	public void setUp() {
		
		local = new Local(1, "Local Prueba", "Comuna Prueba", "Direccion Prueba", 
				"37.426719925366015", "-122.14496588560083", "+569 11111111");
		
		localesTest.add(local);
	}
	
	@Test
	public void localCreado() {	
		
		assertNotNull(local);			
	}
	
	@Test
	public void nombreLocal () {
		
		assertTrue(local.getId() == 1);
	}
	
	@Test
	public void listaTamaño () {
	
		assertTrue(localesTest.size() == 1);
	}
	
	
	

}

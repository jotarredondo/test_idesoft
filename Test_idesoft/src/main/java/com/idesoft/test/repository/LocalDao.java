package com.idesoft.test.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.idesoft.test.model.Local;


@Repository
public interface LocalDao extends JpaRepository<Local, Integer> {
	
	@Query(value = "SELECT local_id, local_nombre, local_direccion, local_telefono, local_lat, local_lng from local where comuna_nombre like %?1% ",nativeQuery = true )
	List<Local> findByComuna(String comuna);

}

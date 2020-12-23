package com.idesoft.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Local {

	@Id
	@Column(name="local_id")
	private Integer id;
	@Column(name="local_nombre")
	private String nombreDeLocal;
	@Column(name="comuna_nombre")
	private String comuna;
	@Column(name="local_direccion")
	private String direccion;
	@Column(name="local_lat")
	private String latitud;
	@Column(name="local_lng")
	private String longitud;
	@Column(name="local_telefono")
	private String telefono;
	

}

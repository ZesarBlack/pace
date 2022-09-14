package com.pc.usr.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BeansUsuarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3032606958199581521L;
	
	private String nombre;
	private String paterno;
	private String materno;
	private Integer edad;

}

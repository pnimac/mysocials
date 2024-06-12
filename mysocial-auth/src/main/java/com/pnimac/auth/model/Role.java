package com.pnimac.auth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	
	public static final String USER = new Role("USER");
	public static final String SERVICE = new Role("SERVICE");
	
	private String name;

}

package com.pnimac.auth.model;

import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
	
	private String displayName;
	private String profilePictureURL;
	private Set<Address> addresses;
	private Date birthday;

}

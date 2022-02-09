package com.bezkoder.spring.security.jwt.payload.response;

import lombok.Data;

import java.util.List;

public @Data
class JwtResponse {
	private Long id;
	private String username;
	private String nom;
	private String prenom;
	private String email;
	private String dateBirth;
	private List<String> roles;
	private String token;
	private String refreshToken;

	public JwtResponse(Long id, String username, String nom, String prenom, String email, String dateBirth, List<String> roles, String token, String refreshToken) {
		this.id = id;
		this.username = username;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateBirth = dateBirth;
		this.roles = roles;
		this.token = token;
		this.refreshToken = refreshToken;
	}
}

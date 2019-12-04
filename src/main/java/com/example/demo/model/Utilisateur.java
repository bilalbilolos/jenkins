package com.example.demo.model;


public class Utilisateur  {

	private Long idu;
	private String nom;
	private String login;
	private String password;

	public Utilisateur(Long id,String nom, String login, String password) {
		this.idu=id;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}
	public Utilisateur( String login, String password) {

		this.login = login;
		this.password = password;
	}

	public Long getIdu() {
		return idu;
	}

	public void setIdu(Long idu) {
		this.idu = idu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}

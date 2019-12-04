package com.example.demo.service;

import com.example.demo.model.Utilisateur;

public interface UtilisateurService {

	public boolean correctLogin(String login);
	public boolean correctLoginAndPwd(Utilisateur utilisateur);

}

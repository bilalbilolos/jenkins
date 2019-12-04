package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.model.Utilisateur;
import com.example.demo.util.Users;

import java.util.List;



@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Override
	public boolean correctLogin(String login) {
		List<Utilisateur> users=Users.getUtilisateurList();
		for(Utilisateur user :users)
			if(user.getLogin()==login)
				return true;
		return false;
	}

	@Override
	public boolean correctLoginAndPwd(Utilisateur utilisateur) {
		List<Utilisateur> users=Users.getUtilisateurList();
		for(Utilisateur u :users)
			if(u.getLogin()==utilisateur.getLogin() && u.getLogin()==utilisateur.getPassword() )
				return true;
		return false;
	}
}

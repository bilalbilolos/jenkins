package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.model.Utilisateur;
import com.example.demo.service.UtilisateurServiceImpl;

import static org.junit.Assert.assertEquals;

public class Test_unitaire {

    UtilisateurServiceImpl utilisateurService = new UtilisateurServiceImpl();

    
    //String nom= "Ahmed";
    String nom= "bilal";
    Utilisateur u1=new Utilisateur("bilal", "bilal");
    Utilisateur u2=new Utilisateur("bilal", "bilal");
    @Test
    public void userLoginTest() {
        System.out.println("Test correct login");
        assertEquals(true,utilisateurService.correctLogin(nom));
    }
    
    
    @Test
    public void userTest() {
        System.out.println("Test correct login And Pwd");
        assertEquals(true,utilisateurService.correctLoginAndPwd(u1));
    }

}

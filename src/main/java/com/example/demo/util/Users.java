package com.example.demo.util;


import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Utilisateur;

public class Users {
    private static List<Utilisateur> userss = null;
    public static List<Utilisateur> getUtilisateurList() {
        if(userss==null){
            userss = new ArrayList();
            userss.add(new Utilisateur(1L,"bilal","bilal","bilal"));
            userss.add(new Utilisateur(1L,"sanae","admin","123456"));
            userss.add(new Utilisateur(1L,"sanae","admin","0000"));
        }
        return userss;
    }

}

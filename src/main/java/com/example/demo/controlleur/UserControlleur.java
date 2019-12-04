package com.example.demo.controlleur;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Utilisateur;
import com.example.demo.service.UtilisateurService;


@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserControlleur {
    @Autowired
    private UtilisateurService utilisateurService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean  login(@RequestBody Utilisateur u) {
        return utilisateurService.correctLoginAndPwd(u);
    }



}

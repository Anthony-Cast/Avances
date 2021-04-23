package com.example.avances.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminRestauranteController {
    @GetMapping("/login")
    public String loginAdmin(){
        return "AdminRestaurantes/login";
    }
    @GetMapping("/register")
    public String registerAdmin(){
        return "AdminRestaurantes/register";
    }
    @GetMapping("/registro")
    public String esperaConfirmacion(){
        return "AdminRestaurantes/registro";
    }
    @GetMapping("/olvide")
    public String olvideContraseña(){
        return "AdminRestaurantes/olvide";
    }
    @PostMapping("/estado")
    public String estadoAdmin(@RequestParam("correo") String correo, Model model){
        //Se valida con el correo si en la bd aparece como usuario aceptado o en espera y tendría dos posibles salidas
        System.out.println(correo);
        if(correo!=""){
            return "AdminRestaurantes/restaurante";
        }
        model.addAttribute("mensaje","Aun no has sido aceptado");
        return "redirect:/login";
    }
}

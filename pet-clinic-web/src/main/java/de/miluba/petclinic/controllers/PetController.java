package de.miluba.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

    @RequestMapping({"/pet","/pet/index","/pet/index.html"})
    public String listPets(){
        return "pet/index";
    }
}

package de.miluba.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pet")
@Controller
public class PetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listPets() {
        return "pet/index";
    }
}

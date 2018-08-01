package de.miluba.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listPets(){
        return "owner/index";
    }
}

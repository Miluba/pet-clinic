package de.miluba.petclinic.controllers;

import de.miluba.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(final OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listPets(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owner/index";
    }
}

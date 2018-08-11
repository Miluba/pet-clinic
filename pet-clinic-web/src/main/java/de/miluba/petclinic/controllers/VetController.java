package de.miluba.petclinic.controllers;

import de.miluba.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(final VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", ".html", "/", "/index", "/index.html"})
    public String listVets(final Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}

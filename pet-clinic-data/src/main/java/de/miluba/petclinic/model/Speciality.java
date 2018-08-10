package de.miluba.petclinic.model;

public class Speciality {

    private String name;
    private String description;

    public Speciality(String name,String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}

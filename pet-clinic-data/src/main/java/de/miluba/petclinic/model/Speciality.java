package de.miluba.petclinic.model;

public class Speciality {

    private String speciality;
    private String description;

    public Speciality(String speciality, String description) {
        this.speciality = speciality;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getSpeciality() {
        return speciality;
    }
}

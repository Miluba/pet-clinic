package de.miluba.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Speciality {

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "description")
    private String description;

    public Speciality() {
    }

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

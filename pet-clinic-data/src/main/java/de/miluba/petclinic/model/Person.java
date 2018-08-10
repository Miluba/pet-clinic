package de.miluba.petclinic.model;

public class Person extends BaseEntity {

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

}

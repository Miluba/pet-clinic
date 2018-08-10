package de.miluba.petclinic.model;

public enum Species {
    CAT("cat"),DOG("dog"),FISH("fish");

    private final String speciesName;

    Species(String speciesName) {
        this.speciesName = speciesName;
    }

    @Override
    public String toString() {
        return speciesName;
    }
}

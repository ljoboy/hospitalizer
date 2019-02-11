package org.pbreakers;

class Dosage {
    private int nbJour;
    private int nbComprime;
    private int agePatient;
    private int nbFois;

    Dosage(){

    }

    public int getAgePatient() {
        return agePatient;
    }

    public int getNbComprime() {
        return nbComprime;
    }

    public int getNbFois() {
        return nbFois;
    }

    public int getNbJour() {
        return nbJour;
    }

    public void setAgePatient(int agePatient) {
        this.agePatient = agePatient;
    }

    public void setNbComprime(int nbComprime) {
        this.nbComprime = nbComprime;
    }

    public void setNbFois(int nbFois) {
        this.nbFois = nbFois;
    }

    public void setNbJour(int nbJour) {
        this.nbJour = nbJour;
    }
}

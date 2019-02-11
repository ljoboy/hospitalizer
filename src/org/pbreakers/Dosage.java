package org.pbreakers;

class Dosage implements Affichable {
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

    @Override
    public void afficher() {
        System.out.println("Age du patient : "+this.getAgePatient()+" nombre des comprimes :"+this.nbComprime+" nombre de fois/jour : "+this.nbFois+" nombres de jours : "+this.nbJour);
    }
}

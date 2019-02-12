package org.pbreakers;

class Docteur extends Personnel {
    Docteur(String nom, String postnom, String prenom) {
        super(nom, postnom, prenom);
    }

    void consuler(Fiche f){
        f.consultations.add(new Consultation(this));
    }

    Ordonnance ordonnance(Fiche f){
        return new Ordonnance(f, this);
    }
}

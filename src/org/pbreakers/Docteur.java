package org.pbreakers;

public class Docteur extends Personnel {
    Docteur(String nom, String postnom, String prenom) {
        super(nom, postnom, prenom);
    }

    Consultation consuler(){
        return new Consultation(this);
    }

    Ordonnance ordonnance(Fiche f){
        return new Ordonnance(f, this);
    }
}

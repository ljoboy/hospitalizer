package org.pbreakers;

class Infirmier extends Personnel {
    Infirmier(String nom, String postnom, String prenom) {
        super(nom, postnom, prenom);
    }

    void patientChambre(Chambre ch, Patient p){
        if (ch.patients.size() < ch.getNbLit()) {
            ch.patients.add(p);
            System.out.println("Patient ajouter avec succes");
        }else{
            System.out.println("La chambre est pleine");
        }
    }
}

package org.pbreakers;

import java.util.Date;

class Consultation implements Affichable{
    private Date date = new Date();
    private Docteur docteur;
    private Date rdv;

    Consultation(Docteur doc){
        this.docteur = doc;
    }

    public Date getRdv() {
        return rdv;
    }

    public void setRdv(Date rdv) {
        this.rdv = rdv;
    }

    public void afficher(){
        System.out.println("Consultation du "+date.toString()+" par le Dr "+docteur.getNom()+" "+docteur.getPostnom()+" "+docteur.getPrenom());
    }
}

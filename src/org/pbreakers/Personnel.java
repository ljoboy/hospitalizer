package org.pbreakers;

abstract class Personnel extends Personne implements PersonnelInterface{
    static private int nb = 0;
    private String matricule;
    Personnel(String nom, String postnom, String prenom) {
        super(nom, postnom, prenom);
        Personnel.nb++;
        this.setMatricule("19"+(nom.substring(0,1)+postnom.substring(0,1)+prenom.substring(0,1)).toUpperCase() + this.getNb());
    }

    private String getNb(){
        int count = 0;
        StringBuilder nb2 = new StringBuilder();
        while(nb > 0) {
            nb = nb / 10;
            count = count + 1;
        }
        for (int i = count; i <  4; i++) nb2.append(0);
        return nb2 + Integer.toString(nb);
    }

    public String getMatricule() {
        return matricule;
    }

    private void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}

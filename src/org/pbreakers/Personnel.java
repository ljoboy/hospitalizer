package org.pbreakers;

abstract class Personnel implements PersonnelInterface{

    private String nom, postnom, prenom, matricule;
    static private int nb = 0;

    Personnel(String nom, String postnom, String prenom){
        this.setNom(nom);
        this.setPostnom(postnom);
        this.setPrenom(prenom);
        nb++;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    private void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public void afficher() {
        System.out.println(this.getNom()+" "+this.getPostnom()+" "+this.getPrenom());
    }
}

package org.pbreakers;

abstract class Personnel implements PersonnelInterface{

    private String nom, postnom, prenom, matricule;
    private static int nb = 0;

    Personnel(String nom, String postnom, String prenom){
        this.setNom(nom);
        this.setPostnom(postnom);
        this.setPrenom(prenom);
        this.setMatricule("15"+(nom.substring(0,1)+postnom.substring(0,1)+prenom.substring(0,1)).toUpperCase());
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

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}

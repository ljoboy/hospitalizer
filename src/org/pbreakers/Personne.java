package org.pbreakers;

public abstract class Personne implements Affichable {
    private String nom, postnom, prenom;

    Personne(String nom, String postnom, String prenom){
        this.setNom(nom);
        this.setPostnom(postnom);
        this.setPrenom(prenom);

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

    @Override
    public void afficher() {
        System.out.println(this.getNom()+" "+this.getPostnom()+" "+this.getPrenom());
    }
}

package org.pbreakers;

public class Patient extends Personne implements Affichable {
    private int poids;
    private int age;
    private String sexe;

    Patient(String nom, String postnom, String prenom){
        super(nom, postnom, prenom);
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}

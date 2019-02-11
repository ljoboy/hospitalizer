package org.pbreakers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        boolean m = true;
        do {
            System.out.println("====================================================================");
            System.out.println("===============      BIENVENUE CHEZ HOSPITALIZER      ==============");
            System.out.println("====================================================================");
            System.out.println("Veuilez choisir l'un des chiffres ci-apres pour operer votre choix :");
            System.out.println("\t 1. Chambre");
            System.out.println("\t 2. Consultation");
            System.out.println("\t 3. Docteur");
            System.out.println("\t 4. Dosage");
            System.out.println("\t 5. Fiche");
            System.out.println("\t 6. Infirmier");
            System.out.println("\t 7. Medicament");
            System.out.println("\t 8. Ordonnance");
            System.out.println("\t 9. Patient");
            System.out.println("\t 10. Pharmacie");
            System.out.println("\t 11. Pharmacien");
            System.out.println("\t 12. Receptioniste");
            System.out.println("\t 13. Service");
            System.out.println("\t 0. Pour quitter");
            Scanner sc = new Scanner(System.in);
            String choix = sc.next();
            int sous_choix;
            if (choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4") || choix.equals("5") || choix.equals("6") || choix.equals("7") ||
                    choix.equals("8") || choix.equals("9") || choix.equals("10") || choix.equals("11") || choix.equals("12") || choix.equals("13")) {
                sous_choix = sous_menu();
            }else if (choix.equals("0")){
                System.out.println("Aurevoir !");
                m = false;
            }else {
                System.out.println("Veuillez operer un choix valide");
            }
        }while (m);

    }

    private static int sous_menu() {
        int sm;
        do {
            System.out.println("Choisissez l'operation a effectuer svp : ");
            System.out.println("1. Ajouter");
            System.out.println("2. Supprimer");
            System.out.println("3. Lister");
            System.out.println("4. Chercher");
            System.out.println("0. Menu principal");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equals("0") || sc.next().equals("1") || sc.next().equals("2") || sc.next().equals("3") || sc.next().equals("4")){
                sm = sc.nextInt();
            }else{
                System.out.println("Veuillez entrer un nombre valide");
                sm = -1;
            }
        }while (sm<0 || sm>3);
        return sm;
    }
}
package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();

        // Création de quelques employés
        Employe emp1 = new Employe(1, "Ben Ali", "Ahmed", "IT", 3);
        Employe emp2 = new Employe(2, "Ben Salah", "Fatma", "RH", 2);
        Employe emp3 = new Employe(3, "Ben Youssef", "Mohamed", "Finance", 4);

        // Test des différentes opérations
        System.out.println("Ajout des employés :");
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        System.out.println("\nAffichage des employés :");
        societe.displayEmploye();

        System.out.println("\nRecherche d'un employé par nom (Ben Ali) :");
        System.out.println(societe.rechercherEmploye("Ben Ali"));

        System.out.println("\nTri des employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri des employés par département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("\nSuppression d'un employé :");
        societe.supprimerEmploye(emp2);
        societe.displayEmploye();
    }
} 
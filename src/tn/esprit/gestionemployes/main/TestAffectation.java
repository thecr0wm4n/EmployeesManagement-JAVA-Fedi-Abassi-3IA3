package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.entities.Employe;

public class TestAffectation {
    public static void main(String[] args) {
        // Création d'une instance de AffectationHashMap
        AffectationHashMap affectations = new AffectationHashMap();

        // Création de quelques employés
        Employe emp1 = new Employe(1, "Ben Ali", "Ahmed", "IT", 3);
        Employe emp2 = new Employe(2, "Ben Salah", "Fatma", "RH", 2);
        Employe emp3 = new Employe(3, "Ben Youssef", "Mohamed", "Finance", 4);

        // Création de quelques départements
        Departement dept1 = new Departement(1, "IT", 10);
        Departement dept2 = new Departement(2, "RH", 5);
        Departement dept3 = new Departement(3, "Finance", 8);

        // Test d'ajout d'affectations
        System.out.println("Ajout des affectations :");
        affectations.ajouterEmployeDepartement(emp1, dept1);
        affectations.ajouterEmployeDepartement(emp2, dept2);
        affectations.ajouterEmployeDepartement(emp3, dept3);

        // Affichage des affectations
        System.out.println("\nAffichage initial des affectations :");
        affectations.afficherEmployesEtDepartements();

        // Test d'ajout du même employé dans un autre département
        System.out.println("\nTentative d'ajout du même employé dans un autre département :");
        affectations.ajouterEmployeDepartement(emp1, dept2);
        affectations.afficherEmployesEtDepartements();

        // Test de recherche
        System.out.println("\nTest de recherche :");
        System.out.println("Recherche de l'employé 1 : " + affectations.rechercherEmploye(emp1));
        System.out.println("Recherche du département IT : " + affectations.rechercherDepartement(dept1));

        // Test de suppression
        System.out.println("\nTest de suppression :");
        affectations.supprimerEmploye(emp2);
        affectations.afficherEmployesEtDepartements();

        // Test de tri
        System.out.println("\nTest de tri :");
        affectations.trierMap().forEach((employe, departement) -> 
            System.out.println("Employé: " + employe + " | Département: " + departement)
        );

        // Affichage des employés et départements séparément
        System.out.println("\nListe des employés :");
        affectations.afficherEmployes();
        
        System.out.println("\nListe des départements :");
        affectations.afficherDepartements();
    }
} 
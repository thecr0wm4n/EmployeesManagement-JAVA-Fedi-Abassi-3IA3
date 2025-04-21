package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Departement;

import java.util.TreeSet;

public class MainDepartement {
    public static void main(String[] args) {
        // Création d'une instance de DepartementHashSet
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Création de quelques départements
        Departement dept1 = new Departement(1, "IT", 10);
        Departement dept2 = new Departement(2, "RH", 5);
        Departement dept3 = new Departement(3, "Finance", 8);

        // Test des différentes opérations
        System.out.println("Ajout des départements :");
        gestionDepartements.ajouterDepartement(dept1);
        gestionDepartements.ajouterDepartement(dept2);
        gestionDepartements.ajouterDepartement(dept3);

        System.out.println("\nAffichage des départements :");
        gestionDepartements.displayDepartement();

        System.out.println("\nRecherche d'un département par nom (IT) :");
        System.out.println(gestionDepartements.rechercherDepartement("IT"));

        System.out.println("\nTri des départements par ID :");
        TreeSet<Departement> departementsTries = gestionDepartements.trierDepartementById();
        departementsTries.forEach(System.out::println);

        System.out.println("\nSuppression d'un département :");
        gestionDepartements.supprimerDepartement(dept2);
        gestionDepartements.displayDepartement();
    }
} 
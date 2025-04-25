package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.entities.Employe;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des employés et leurs départements :");
        affectations.forEach((employe, departement) -> 
            System.out.println("Employé: " + employe + " | Département: " + departement)
        );
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        affectations.keySet().forEach(System.out::println);
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        affectations.values().forEach(System.out::println);
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
} 
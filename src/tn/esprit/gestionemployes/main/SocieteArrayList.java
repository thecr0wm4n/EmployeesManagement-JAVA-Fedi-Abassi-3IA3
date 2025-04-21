package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.utils.IGestion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream()
                .anyMatch(emp -> emp.getNom().equals(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        employes.sort(null); // Utilise le compareTo défini dans Employe
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade));
    }
} 
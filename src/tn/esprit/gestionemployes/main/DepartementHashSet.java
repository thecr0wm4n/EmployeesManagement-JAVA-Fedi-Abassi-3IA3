package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.utils.IDepartement;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departements.stream()
                .anyMatch(dept -> dept.getNomDepartement().equals(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        departements.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> treeSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        treeSet.addAll(departements);
        return treeSet;
    }
} 
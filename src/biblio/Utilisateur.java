/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Utilisateur {
   private String nom;
    private int numeroIdentification;
    private boolean estAjour;
    private ArrayList<Livre> livresEmpruntes;

    // Constructeur
    public Utilisateur(String nom, int numeroIdentification,boolean statut) {
        this.nom = nom;
        this.numeroIdentification = numeroIdentification;
        this.estAjour = statut;
        this.livresEmpruntes = new ArrayList<>();
    }

    // Méthode pour emprunter un livre
    public void emprunterLivre(Livre livre) {
        livresEmpruntes.add(livre);
    }

    // Méthode pour retourner un livre
    public void retournerLivre(Livre livre) {
        livresEmpruntes.remove(livre);
    }

    // Méthode pour afficher les livres empruntés par l'utilisateur
    public void afficherLivresEmpruntes() {
        System.out.println("Livres empruntés par " + nom + ":");
        for (Livre livre : livresEmpruntes) {
            System.out.println(livre);
        }
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public boolean getEstAjour() {
        return this.estAjour;
    }

    public void setEstAjour(boolean statut) {
        this.estAjour = statut;
    }

    public int getNumeroIdentification() {
        return numeroIdentification;
    }

    public void setNumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }
}
   

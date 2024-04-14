/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author Lenovo
 */
public class Essai extends Livre {
    private String theme;

    public Essai(String titre, String auteur, int anneePublication, String ISBN, String theme) {
        super(titre, auteur, anneePublication, ISBN);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Essai{" +
                "titre='" + getTitre() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", anneePublication=" + getAnneePublication() +
                ", ISBN='" + getISBN() + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }
}



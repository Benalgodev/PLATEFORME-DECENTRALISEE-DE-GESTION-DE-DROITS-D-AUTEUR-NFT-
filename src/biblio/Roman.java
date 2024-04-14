package biblio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Roman extends Livre {
    private String genre;

    public Roman(String titre, String auteur, int anneePublication, String ISBN, String genre) {
        super(titre, auteur, anneePublication, ISBN);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Roman{" +
                "titre='" + getTitre() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", anneePublication=" + getAnneePublication() +
                ", ISBN='" + getISBN() + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

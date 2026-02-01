package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Gare {
    private String id;
    private String nom;
    private String ville;
    private int nombreQuais;
    private boolean accessible;
    private String region;


    public Gare(String id, String nom, String ville, int nombreQuais) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.nombreQuais = nombreQuais;
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getVille() { return ville; }
    public int getNombreQuais() { return nombreQuais; }
}

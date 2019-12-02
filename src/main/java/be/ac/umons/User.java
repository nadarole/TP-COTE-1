package be.ac.umons;

public class User {
    private static int id=0;
    private String nom;
    private String prenom;
    public User(String nom,String prenom){
        this.id+= 1;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String Prenom){
        this.prenom = prenom;
    }
}

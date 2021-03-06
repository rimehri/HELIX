/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Ach
 */
public class User {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected int telephone;
    protected String password;

    public User(String nom) {
        this.nom = nom;
    }

    public User(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    public User(int id, String nom, String prenom, int telephone, String adresse, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.password = password;
    }

    public User(String nom, String prenom, int telephone, String adresse, String password) {

        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "\nUser: {" + "id= " + id + ", Nom= " + nom + ", Prénom= " + prenom + ", Adresse= " + adresse + "Téléphone= " + telephone + "Password= " + password + '}';
    }
    
}

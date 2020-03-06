package Entity;

/**
 *
 * @author ASUS
 */
public class Fournisseur {
    private int id;
    private String Nom;
    private String Adresse;
    private String email;

    public Fournisseur(int id, String Nom, String Adresse, String email) {
        this.id = id;
        this.Nom = Nom;
        this.Adresse = Adresse;
        this.email = email;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fournisseur(String Nom, String Adresse, String email) {
        this.Nom = Nom;
        this.Adresse = Adresse;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "Nom=" + Nom + ", Adresse=" + Adresse + ", email=" + email + '}';
    }

    public Fournisseur() {
    }
}

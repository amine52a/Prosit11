import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nombreEmployes;

    // Constructeur sans paramètres
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Departement that = (Departement) obj;
        return id == that.id && nom.equals(that.nom);
    }

    @Override
    public String toString() {
        return "Departement{id=" + id + ", nom='" + nom + '\'' +
                ", nombreEmployes=" + nombreEmployes + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nombreEmployes);
    }
}
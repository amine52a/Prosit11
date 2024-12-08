import java.util.Objects;

public class Employe implements Comparable<Employe> {
    int identifiant,grade;
    String nom,prenom,departement;

    public Employe() {
    }

    public Employe(int identifiant, int grade, String nom, String prenom, String departement) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return identifiant == employe.identifiant && Objects.equals(nom, employe.nom);
    }


    @Override
    public int compareTo(Employe o) {
        return this.identifiant-o.identifiant;
    }
}

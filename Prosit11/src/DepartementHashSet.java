import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }
 ///a7sen methode mt3 display pour tous les cas
    @Override
    public void displayDepartement() {
   for (Departement d:departements){
       System.out.println(d);
   }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return null;
    }
}

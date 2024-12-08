import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    //List<Employe> employeList = new ArrayList<>();
    ArrayList<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0;i<employes.size();i++){
            if(employes.get(i).nom.equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        //System.out.println(employes);
        for(int i=0;i<employes.size();i++){
            System.out.println(employes.get(i));
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);

    }

    @Override
    public void trierParGrade() {
        Comparator<Employe> cm = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.grade-o2.grade;
            }
        };
        Collections.sort(employes,cm);

    }

    @Override
    public void trierParNomDep() {

        Collections.sort(employes, new TrierParNomDep());
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> cm = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.departement.compareTo(o2.departement);
            }
        };
        Comparator<Employe> cm2 = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.grade-o2.grade;
            }
        };
        Collections.sort(employes,cm.thenComparing(cm2));


    }
}

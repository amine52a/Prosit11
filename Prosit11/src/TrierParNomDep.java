import java.util.Comparator;

public class TrierParNomDep implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.departement.compareTo(o2.departement);
    }
}
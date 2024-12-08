public class MainClass {
    public static void main(String[] args) {
       /* Employe e = new Employe(322,4,"hjiri","wiem","informatique");
        Employe e2 = new Employe(311,2,"mannoubi","aymen","informatique");
        Employe e3 = new Employe(222,5,"barguaoui","ines","gc");
        Employe e4 = new Employe(232,3,"mezri","baha","informatique");
        SocieteArrayList soc = new SocieteArrayList();
        soc.ajouterEmploye(e);
        soc.ajouterEmploye(e2);
        soc.ajouterEmploye(e3);
        soc.ajouterEmploye(e4);
       // soc.ajouterEmploye(e);
        //System.out.println(soc.rechercherEmploye(new Employe(232,3,"mezri","baha","informatique")));
        soc.displayEmploye();
        System.out.println("----------trier par id");
        soc.trierEmployeParId();
        soc.displayEmploye();
        System.out.println("----------trier par grade");
        soc.trierParGrade();
        soc.displayEmploye();
        System.out.println("----------trier par departement");
        soc.trierParNomDep();
        soc.displayEmploye();
        System.out.println("----------trier par departement et grade");
        soc.trierEmployeParNomDépartementEtGrade();
        soc.displayEmploye();
        */

        DepartementHashSet gestionDepartements = new DepartementHashSet();


        Departement dep1 = new Departement(1, "Informatique", 50);
        Departement dep2 = new Departement(2, "Ressources Humaines", 30);
        Departement dep3 = new Departement(3, "Marketing", 20);

        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();





    }
}

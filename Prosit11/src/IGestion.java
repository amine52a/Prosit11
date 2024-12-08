public interface IGestion<T> {
    public void ajouterEmploye(T t);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T t);
    public void supprimerEmploye(T t);
    public void displayEmploye();
    public void trierEmployeParId();
    void trierParGrade();
    void trierParNomDep();
    public void trierEmployeParNomDépartementEtGrade();

}

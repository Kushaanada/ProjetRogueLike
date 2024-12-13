public class Arme {
    String nom;
    int stat;
    int effet;
    String description;
    String classeArme;
    boolean equiper;
    public Arme (String nom, int stat, int effet, String description, String classeArme, boolean equiper) {
        this.nom = nom;
        this.stat = stat;
        this.effet = effet;
        this.description = description;
        this.classeArme = classeArme;
        this.equiper = equiper;
    }
}

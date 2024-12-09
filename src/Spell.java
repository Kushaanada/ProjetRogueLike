public class Spell {
    // IMPORTANT: EN FONCTION DE LA RARETÉ, LA VALEUR DES RANDOMS SERA PLUS OU MOINS ÉLEVÉE
    String nom;
    String rarete;
    int critRate; // Valeur sur 100, pour pourcentage
    int defense;
    int attaque;
    int pv;
    int reductionDegats; // Valeur sur 100, pour pourcentage
    public Spell (String nom, String rarete, int critRate, int defense, int attaque, int pv, int reductionDegats ) {
        this.nom = nom;
        this.rarete = rarete;
        this.critRate = critRate;
        this.defense = defense;
        this.attaque = attaque;
        this.pv = pv;
        this.reductionDegats = reductionDegats;
    }
}

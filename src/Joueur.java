import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;
@SuppressWarnings("unused")
public class Joueur {
    String nom; // Nom du joueur
    int creditsRadiants; // Monnaie du jeu
    String classeJoueur;
    Inventaire inventaire;
    public Joueur (String nom, String classeJoueur) {
        this.nom = nom;
        this.classeJoueur = classeJoueur;
        this.creditsRadiants = 0;
    }
}

import java.util.Random;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.Vector;
@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) throws Exception {
        boolean pass;
        int nombreJoueursInt = 0;
        System.out.println("Liste des joueurs: \n");
        do {
            Vector<Joueur> listeJoueurs = new Vector<Joueur>();
            try { // Pour éviter de faire planter le programme si il a mal écrit le nombre
                String nombreJoueurs = JOptionPane.showInputDialog(null, "Combien de joueur?", "", JOptionPane.QUESTION_MESSAGE);
                if (nombreJoueurs == null) { // Si il clique sur Cancel, ça ferme le programme
                    System.exit(0);
                }
                nombreJoueursInt = Integer.valueOf(nombreJoueurs);
                pass = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur lors de vôtre choix, veuillez recommencer.", null, JOptionPane.ERROR_MESSAGE);
                pass = false;
            }
        } while (pass == false);
        // Boucle for servant à créer les joueurs
        for(int i = 0 ; i < nombreJoueursInt ; i++  ) {
           String nom = JOptionPane.showInputDialog(null, "Quel est ton nom, joueur " + (i+1), "", JOptionPane.QUESTION_MESSAGE);
           String classeJoueur = JOptionPane.showInputDialog(null, "Quelle classe veux-tu? \n 1: Guerrier \n 2: Mage \n 3: Soutien \n 4: Tank", "", JOptionPane.QUESTION_MESSAGE);
           ClasseJoueur joueur = new ClasseJoueur(nom, classeJoueur);
           JOptionPane.showMessageDialog(null,"Enchanté, " + joueur.nom , "", JOptionPane.INFORMATION_MESSAGE);
           System.out.println(i + ": " + joueur.nom + "\nClasse: " + joueur.classeJoueur + "\n");
        }
        //Création d'une collection de joueurs
        
        //Création des Spells: Collection de spells vide
        Vector<Spell> listeSpells = new Vector<Spell>();
        //Création des Spells: Ajout des spells créés dans une fonction externe dans la collection vide
        creerSpells(listeSpells);
        piocheSpells(listeSpells, null);
    }
    public static void creerSpells(Vector<Spell> listeSpells) {
        Random random = new Random();
        Vector<Spell>listSpells = listeSpells;
        //Buff Attaque:
        Spell buffAttaqueCommun = new Spell("Buff d'Attaque Commun", "Commun", 0, 0, random.nextInt(20)+1, 0, 0);
        listSpells.add(buffAttaqueCommun);
        Spell buffAttaqueRare = new Spell("Buff d'Attaque Rare", "Rare", 0, 0, random.nextInt(60)+20, 0, 0);
        listSpells.add(buffAttaqueRare);
        Spell buffAttaqueEpique = new Spell("Buff d'Attaque Épique", "Épique", 0, 0, random.nextInt(130)+60, 0, 0);
        listSpells.add(buffAttaqueEpique);
        Spell buffAttaqueLegendaire = new Spell("Buff d'Attaque Légendaire", "Légendaire", 0, 0, random.nextInt(250)+130, 0, 0);
        listSpells.add(buffAttaqueLegendaire);
        //Buff Défense:
        Spell buffDefenseCommun = new Spell("Buff de Défense Commun", "Commun", 0, 0, random.nextInt(10)+1, 0, 0);
        listSpells.add(buffDefenseCommun);
        Spell buffDefenseRare = new Spell("Buff de Défense Rare", "Rare", 0, 0, random.nextInt(30)+10, 0, 0);
        listSpells.add(buffDefenseRare);
        Spell buffDefenseEpique = new Spell("Buff de Défense Épique", "Épique", 0, 0, random.nextInt(70)+30, 0, 0);
        listSpells.add(buffDefenseEpique);
        Spell buffDefenseLegendaire = new Spell("Buff de Défense Légendaire", "Légendaire", 0, 0, random.nextInt(120)+70, 0, 0);
        listSpells.add(buffDefenseLegendaire);


        //Remplissage de la collection vide
        listeSpells = listSpells;
    }
    public static void creerArmes() {
        
    }
    public static void piocheSpells (Vector<Spell> listespells, Vector<Joueur> listeJoueurs) {
        Vector<Spell>listSpells = listespells;

    }
    
}
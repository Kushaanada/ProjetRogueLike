import javax.swing.JOptionPane;

public class ClasseJoueur extends Joueur{
    int attaque;
    int defense;
    int pv;
    int reductionDegats; // Réduction de dégats
    int critRate; // Taux de crittique
    boolean vivant; // Condition pour les futures réanimations
    public ClasseJoueur(String nom, String classeJoueur) {
        super(nom, classeJoueur);
        boolean ok = true;
        this.vivant = true;
        do {
            if (classeJoueur.trim().toLowerCase().equals("guerrier") || classeJoueur.trim().toLowerCase().equals("1")) {
                this.attaque = 15;
                this.defense = 10;
                this.pv = 60;
                this.reductionDegats = 5;    
                this.critRate = 5;
                ok = true;
            } else if (classeJoueur.trim().toLowerCase().equals("mage") || classeJoueur.trim().toLowerCase().equals("2")) {
                this.attaque = 25;
                this.defense = 5;
                this.pv = 40;
                this.reductionDegats = 0;    
                this.critRate = 10;   
                ok = true;
            } else if (classeJoueur.trim().toLowerCase().contains("soutien") || classeJoueur.trim().toLowerCase().equals("3")) {
                this.attaque = 10;
                this.defense = 8;
                this.pv = 50;
                this.reductionDegats = 0;    
                this.critRate = 5;   
                ok = true;
            } else if (classeJoueur.trim().toLowerCase().equals("tank") || classeJoueur.trim().toLowerCase().equals("4")) {
                this.attaque = 10;
                this.defense = 20;
                this.pv = 80;
                this.reductionDegats = 10;    
                this.critRate = 3; 
                ok = true;  
            } else {
                JOptionPane.showMessageDialog(null, "Erreur lors du choix de vôtre classe.", "", JOptionPane.ERROR_MESSAGE);
                ok = false;
                classeJoueur = JOptionPane.showInputDialog(null, "Quelle classe veux-tu? \n 1: Guerrier \n 2: Mage \n 3: Soutien \n 4: Tank", "", JOptionPane.QUESTION_MESSAGE);
            }
        } while (ok == false);
        
    }
}

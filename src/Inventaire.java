import java.util.Iterator;
import java.util.Vector;

public class Inventaire {
    public Vector<Arme> listeArmes;
    public Vector<Spell> listeSpells;
    public void ajoutArme (Arme monArme) {
        listeArmes.add(monArme);
    }
    public void ajoutSpell (Spell monSpell) {
        listeSpells.add(monSpell);
    }
    public boolean checkArmeEquipe () {
        Iterator<Arme> listeArme = this.listeArmes.iterator();
        while (listeArme.hasNext()) {
            listeArme.next();
            
        }
        return false;
    }
}

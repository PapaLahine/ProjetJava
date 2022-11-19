import java.time.LocalDate;
import java.util.Date;

public class Taches {
    public int identifiant;
    public int dernierId;
    public String titre;
    public String etat;
    public LocalDate datedecréation ;

    public Taches(int identifiant, int dernierId, String titre, String etat, LocalDate datedecréation) {
        this.identifiant = identifiant;
        this.dernierId = dernierId;
        this.titre = titre;
        this.etat = etat;
        this.datedecréation = datedecréation;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getDernierId() {
        return dernierId;
    }

    public void setDernierId(int dernierId) {
        this.dernierId = dernierId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public LocalDate getDatedecréation() {
        return datedecréation;
    }

    public void setDatedecréation(LocalDate datedecréation) {
        this.datedecréation = datedecréation;
    }

    @Override
    public String toString() {
        return "Taches{" +
                "identifiant=" + identifiant +
                ", dernierId=" + dernierId +
                ", titre='" + titre + '\'' +
                ", etat='" + etat + '\'' +
                ", datedecréation=" + datedecréation +
                '}';
    }

    public void addTache(Taches taches) {

    }
}
    
 



   

    

    

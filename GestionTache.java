import java.time.LocalDate;

public class GestionTache{
    public static void main(String[] args) {
       Taches [] tab= new Taches[0];
        GestionnaireTache gestionnaireTache =new GestionnaireTache(8, tab);
        Taches taches =new Taches(3,4,"ert","ert", LocalDate.of( 1994 , 01 , 1 ));
        System.out.println(taches);
        gestionnaireTache.ajouter(true);
        gestionnaireTache.modifier(true);
        gestionnaireTache.suprimer(9);
        Taches [] m = gestionnaireTache.lister("errr");
        System.out.println(m);


    }

}

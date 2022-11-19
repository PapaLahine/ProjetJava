public class GestionnaireTache {
    public Taches []tab ;
   public int  nombreTache;
   


    public GestionnaireTache(int nombreTache, Taches[] tab) {
        this.nombreTache = nombreTache;
        this.tab = tab;

    }

   //public Taches GestionnaireTache() {
         //Taches nombreMax = tab[0];
        //for (Taches j: tab){
           //if(j >nombreMax){
                //nombreMax= j;
            //}
      // }
      // return  nombreMax;


   //}


    public boolean ajouter(boolean tache){

            return tache==true;

    }
    public Boolean modifier (boolean tache){

        return tache==true;
    }
    public Boolean suprimer (int id){
        return true;
    }
    public Taches[] lister(){
        return tab;
    }
    public Taches[]lister(String etat){
        return tab;
    }

}

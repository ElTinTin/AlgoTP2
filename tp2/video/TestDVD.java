package tp2.video;


/**
 *
 * @author Administrateur C SEMPE 
 */
 

public class TestDVD{
   
     
//--------- programme principal � partir duquel tout demarre ... ----------------------
   public static void main(String[]	args)
	{
		UnDVD d1 = new UnDVD("Avatar", "affiche", "Pocahantas au pays des Schtroumpfs", 10);
      UnDVD d2 = new UnDVD("Avengers 2", "affiche", "Pinocchio 2.0", 20);
      UnDVD d3 = new UnDVD("Amazing Spider-Man 2", "affiche", "Pas d'a�rosol pour la tuer celle l�", 15);
      d1.Afficher();
      System.out.println("    ");
      d2.Afficher();
      System.out.println("    ");
      d3.Afficher();
      d1.setEmprunt();
      d1.setEmprunt();
      d1.Afficher();
      d1.setRetour();
      d1.setRetour();
      System.out.println("    ");
      d1.Afficher();  
	}
    
      	
      
}

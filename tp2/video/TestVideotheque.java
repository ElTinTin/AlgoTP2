import java.io.*;

 

public class TestVideotheque{
   
     
//--------- programme principal à partir duquel tout demarre ... ----------------------
   public static void main(String[]	args)
	{
      Videotheque v1 = new Videotheque();
      UnDVD d1 = new UnDVD("Avatar", "affiche", "Pocahantas au pays des Schtroumpfs", 2);
      UnDVD d2 = new UnDVD("Avengers 2", "affiche", "Pinocchio 2.0", 2);
      UnDVD d3 = new UnDVD("Amazing Spider-Man 2", "affiche", "Pas d'aérosol pour la tuer celle là", 15);
      v1.Ajouter(d1);
      v1.Ajouter(d2);
      v1.Ajouter(d3);
      v1.Supprimer();
      System.out.println(v1.NbFilms()+"\n");
      v1.Reset();
      v1.Ajouter(d1);
      v1.Ajouter(d2);
      v1.Ajouter(d3);
      v1.getDVD().Afficher();
      v1.Suivant();
      System.out.println("    ");
      v1.getDVD().Afficher();
      v1.Precedent();
      System.out.println("    ");
      v1.getDVD().Afficher();
      v1.Emprunter();
      v1.Emprunter();
      v1.Emprunter();
      System.out.println("    ");
      v1.getDVD().Afficher();
      v1.Rendre();
      System.out.println("    ");
      v1.getDVD().Afficher();
      System.out.println("    ");
      v1.AfficherV();
      
//       Exemple de chargement dans une videotheque

//       try{
// 		    maVideo.Chargement("ListeDVD.txt");		
// 		}
// 		catch (IOException e)
// 		{
// 	  		System.out.println("problème de fichier par exception");
// 	 	}
		
	  
	}
    
      	
      
}

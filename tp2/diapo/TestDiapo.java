package tp2.diapo;


import tp2.diapo.Diapo;


/**
 *
 * @author Administrateur C SEMPE 
 */
 

public class TestDiapo{
   
     
//--------- programme principal � partir duquel tout demarre ... ----------------------
   public static void main(String[]	args)
	{
		Diapo Vacances = new Diapo();
		Vacances.ajouter("paysage1.jpg");
		Vacances.ajouter("paysage2.jpg");
		Vacances.ajouter("paysage3.jpg");
		Vacances.ajouter("paysage4.jpg");
		
		for(int i=0; i<Vacances.nbPhotos(); i++)
		{
		System.out.println("Résultat Diapo : "+Vacances.getPhoto() );
		}
		
		System.out.println("Résultat Aléatoire : "+Vacances.aleaPhoto() );

  
	}
    
      	
      
}

/**
 * @author Vincent F et Thomas B
 * SERA LA VERSION FINALE DU LAUNCHER
 */

public class JeuBatailleNavale {

	public static void main(String[] args) {
	    //Creations des instances n�cessaires (Scanner, fenetre...)
	    Scanner sc = new Scanner(System.in); 
	    //Creation des variables 
	    String answer = " "; // Utilis�e pour le choix de l'utilsateur du mode de jeu
	    boolean rejouer = true;
	   
	    //Programme en lui m�me : 
	    System.out.println("**** Bienvenue dans notre jeu ****");
	    
	    while(rejouer){ // Boucle principale qui va se relancer � chaque partie.
	    	
		   System.out.println("A quel mode de jeu voulez vous jouer ?");
		   while(answer != 1 || answer != 2 || answer !=3){ // Boucle secondaire concernant le choix du mode de jeu.
			    System.out.println("1 - Humain contre Humain \n2 - Humain contre IA\n3 - Humain contre ... contre Humain");
	
			    System.out.println("Veuillez saisir le num�ro de votre r�ponse :");
			    answer = sc.nextLine();
			    System.out.println("Vous avez saisi : " + answer);
	
			    switch (answer)
			    {
			      case 1:
			        HvsH; // Humain contre Humain
			        break;  
			      case 2:
			    	HvsIA; // Humain contre IA
			    	  break;
			      case 3:
			    	HvsvsH; // Humain contre ... contre Humain
			    	  break;
			      default:
			    	  System.out.println("Vous ne savez pas lire =)");             
			    }
		    }
	    }

	}
	
	public static void HvsH() {
		  // Ici est g�r� le mode de jeu Humain contre Humain
		}
	
	public static void HvsIA() {
		  // Ici est g�r� le mode de jeu Humain contre IA
		}
	
	public static void HvsvsH() {
		  // Ici est g�r� le mode de jeu Humain contre .... contre Humain
		}

}

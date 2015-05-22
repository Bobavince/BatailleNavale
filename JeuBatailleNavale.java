/**
 * @author Vincent F et Thomas B
 * SERA LA VERSION FINALE DU LAUNCHER
 */
import javax.swing.JFrame; // Pour l'affichage en fenetre si on veut évoluer
import java.util.Scanner; // importer le scanner.

public class JeuBatailleNavale {

	public static void main(String[] args) {
	    //Creations des instances nécessaires (Scanner, fenetre...)
	    Scanner sc = new Scanner(System.in); 
	    //Creation des variables 
	    String answer = " "; // Utilisée pour le choix de l'utilsateur du mode de jeu
	    int choix = 0;
	    boolean rejouer = true;
	   
	    //Programme en lui même : 
	    System.out.println("**** Bienvenue dans notre jeu ****");
	    
	    while(rejouer){ // Boucle principale qui va se relancer à chaque partie.
	    	
		   System.out.println("A quel mode de jeu voulez vous jouer ?");
		   while(choix != 1 || choix != 2 || choix !=3){ // Boucle secondaire concernant le choix du mode de jeu.
			    System.out.println("1 - Humain contre Humain \n2 - Humain contre IA\n3 - Humain contre ... contre Humain");
	
			    System.out.println("Veuillez saisir le numéro de votre réponse :");
			    answer = sc.nextLine();
			    choix = (int)(answer.charAt(0));
			    System.out.println("Vous avez saisi : " + choix);
	
			    switch (choix)
			    {
			      case 1:
			        HvsH(); // Humain contre Humain
			        break;  
			      case 2:
			    	HvsIA(); // Humain contre IA
			    	  break;
			      case 3:
			    	HvsvsH(); // Humain contre ... contre Humain
			    	  break;
			      default:
			    	  System.out.println("Vous ne savez pas lire =)");             
			    }
		    }
	    }

	}
	
	public static void HvsH() {
		  // Ici est géré le mode de jeu Humain contre Humain
		}
	
	public static void HvsIA() {
		  // Ici est géré le mode de jeu Humain contre IA
		}
	
	public static void HvsvsH() {
		  // Ici est géré le mode de jeu Humain contre .... contre Humain
		}

}

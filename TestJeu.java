/**
 * @author Vincent F et Thomas B
 * Classe de test lors de la phase de conception.
 * NE SERA PAS DANS LA VERSION FINALE DU JEU !
 */
// Les imports n�cessaires
import javax.swing.JFrame; // Pour l'affichage en fenetre si on veut �voluer

		
public class TestJeu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	//MORCEAU DE CODE POUR ESSAYER L'AFFICHAGE EN FENETRE. A FAIR EN DERNIER
		    JFrame fenetre = new JFrame();
		                
		    //D�finit un titre pour notre fen�tre
		    fenetre.setTitle("BatailleNAVALE");
		    //D�finit sa taille : 400 pixels de large et 100 pixels de haut
		    fenetre.setSize(800, 600);
		    //Nous demandons maintenant � notre objet de se positionner au centre
		    fenetre.setLocationRelativeTo(null);
		    //Termine le processus lorsqu'on clique sur la croix rouge
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //Et enfin, la rendre visible        
		    fenetre.setVisible(true);
	}

}

/**
 * @author Vincent F et Thomas B
 * Classe de gestion du plateau de jeu.
 */

public class Plateau {
	//Les Tableaux de la classe
	int[][][] plateauValeurs; //Initilisation d'un tableau 2D Pour implémentation d'autres valeurs
	boolean[][] plateauBoolean; //Initilisation d'un tableau 2D pour valeurs
	
	//Les variables internes
	
	
	//Les variables externes
	int nbBateaux;
	
	public Plateau(int x, int y){
		plateauValeurs = [x][y][2];
	}

	public Plateau(){
		
	}
	
	
}

/**
* Le plateau est composé de deux niveaux. Un niveau 0 qui sert à connaitre ce qu'il y a sur le le plateau et un niveau 1 qui sert à savoir les actions subit par le plateau.
* Au niveau 0 : 0 correspond à une case vide, -1 à une récif, 1,2,3,...,n au numéro du bateau.
* C'est le plateau qui appelle la méthode du bateau tireur (On devrait faire de la hiérarchie, avec le classe bateau, puis la classe bateau principal, puis bateau tireur)
* Le plateau tire aux coordonnées x,y sur le plateau du joueur Z. La méthode sera donc Tire(Plateau Z, int x, int y)
* Si il touche une case au niveau 0 qui a pour valeur : 0, le tire tombe dans l'eau. -1 le tire ne fait rien (probabilité de rebondir?), 1,2,...n le tire touche un bateau.
* Si le tire touche un bateau, dans ce cas, le bateau en question en est informé. Il met à jour son statut, son état, etc...
* 
* Chaque joueur tire tour à tour.
*/ 
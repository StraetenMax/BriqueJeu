package examCnam;

public class ElementGraphique {
	//propriétés
	private String nom;
	private int hauteur, largeur;
	
	//constructeurs
	public ElementGraphique(){
		nom ="";
		hauteur = 0;
		largeur = 0;
	}
	public ElementGraphique(String nom, int hauteur, int largeur){
		nom = this.nom;
		hauteur = this.hauteur;
		largeur = this.largeur;
		}
	//accesseurs et mutateurs
	public String getNom(){
		return nom;
	}
	public int getHauteur(){
		return hauteur;
	}
	public int getLargeur(){
		return largeur;
	}
	public void setNom(String yNom){
		nom = yNom;
	}
	public void setHauteur(int yHauteur){
		hauteur = yHauteur;
	}
	public void setLargeur(int yLargeur){
		largeur = yLargeur;
	}
	//méthodes
	
}
	

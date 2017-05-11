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
	public String afficher(){
		String str = "Elément affiché";
		return str;
	}
	public String masquer(){
		String str1 = "Elément masqué";
		return str1;
	}
	public String description(){
		String str2 = "Element graphique nommé : "+ this.getNom() +" qui a "+ this.getHauteur() +" pixels de haut et "+ this.getLargeur() +" pixels de large";
		return str2;
	}
}
	

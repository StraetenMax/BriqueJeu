package examCnam;

public class Mur extends ElementFixe{
	//propriétés
	private String couleur;
	
	//constructeur
	public Mur(){
		super();
		couleur = "";
	}
	public Mur(String cNom, int cHauteur, int cLargeur, int cPositionX, int cPositionY,String cCouleur){
		super(cNom, cHauteur, cLargeur, cPositionX, cPositionY);
		couleur = cCouleur;
	}
}

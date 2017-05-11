package examCnam;

public class ElementFixe extends ElementGraphique {
	//propriétés
	private int positionX, positionY;
	
	//constructeurs
	public ElementFixe(){
		super();
		positionX = 0;
		positionY = 0;
	}
	public ElementFixe(String cNom, int cHauteur, int cLargeur, int cPositionX, int cPositionY){
		super(cNom, cHauteur, cLargeur);
		positionX =cPositionX;
		positionY =cPositionY;
	}
	
}

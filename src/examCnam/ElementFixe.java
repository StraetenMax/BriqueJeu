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
	//accesseurs et mutateurs
	public int getPositionX(){
		return positionX;
	}
	public int getPositionY(){
		return positionY;
	}
	public void setPositionX(int zPositionX){
		positionX = zPositionX;
	}
	public void setPositionY(int zPositionY){
		positionY = zPositionY;
	}
	//méthodes
	public String afficher(){
		String str1 = "Elément fixe affiché";
		return str1;
	}
	public String description(){
		String str2 = super.description() +" qui est en position X "+this.getPositionX()+" et position Y "+this.getPositionY();
		return str2;
	}
	
}

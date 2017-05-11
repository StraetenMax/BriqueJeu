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
	// accesseurs et mutateurs
	public String getCouleur(){
		return couleur;
	}
	public void setCouleur(String xCouleur){
		couleur = xCouleur;
	}
	//méthodes
	public boolean plusHautQue(Mur mr){
		boolean str;
		if(mr.getHauteur()>this.getHauteur()){
			str =true;
		}else{str =false;
	}
		return str;
		}
	public String description(){
		String str1 =super.description()+" qui est de couleur "+ this.getCouleur();
		return str1;
	}
}



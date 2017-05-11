package examCnam;

public class Brique extends ElementFixe{
	//propriétés
	private int niveau;
	private boolean aAfficher;
	
	//constructeur
	public Brique(){
		super();
		niveau = 0;
		this.setAAfficher();
	}
	public Brique(String cNom, int cHauteur, int cLargeur, int cPositionX,int cPositionY, int cNiveau){
		super(cNom, cHauteur, cLargeur, cPositionX, cPositionY);
		niveau = cNiveau;
		this.setAAfficher();
	}
	//accesseurs et mutateurs
	public int getNiveau(){
		return niveau;
	}
	public boolean getAAfficher(){
		return aAfficher;
	}
	public void setNiveau(int yNiveau){
		niveau = yNiveau;
		this.setAAfficher();
	}
	public void setAAfficher(){
		if(niveau == 0){
			aAfficher = true;
		}else{
			aAfficher = false;
		}
	}
	//méthodes
	public boolean estMoinsAbimeeQue(Brique brt){
		boolean btn;
		if(brt.getNiveau()>this.getNiveau()){
			btn = false;
		}else{
			btn = true;
		}
		return btn;
	}
	public String description(){
		String str1 = super.description()+"dont le niveau est de "+this.getNiveau();
		return str1;
	}
}

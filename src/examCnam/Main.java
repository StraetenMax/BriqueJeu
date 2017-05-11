package examCnam;

public class Main {

	public static void main(String[] args) {
		ElementGraphique E1 = new ElementGraphique("balle",80,80);
		ElementFixe F1 = new ElementFixe("Titre",40,1000,150,1300);
		Brique B1 = new Brique("Brique1",40,200,300,300,0);
		Brique B2 = new Brique("Brique2",40,200,700,300,0);
		Mur M1 = new Mur("Mur1",40,20000,1,1,"bleu");
		Mur M2 = new Mur("Mur 2",20000,40,1,1,"bleu");
	}

}

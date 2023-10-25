
public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	public void addPorta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.aberta = true;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	
	public void imprimirPorta() {
		System.out.println("==== Porta ====");
		System.out.println("Aberta: " + this.aberta + "\nCor: " + this.cor + "\nDimensão X: " + 
		this.dimensaoX + "\nDimensão Y: " + this.dimensaoY + "\nDimensão Z: " + this.dimensaoZ);
	}
	
	public void abrir() {
		this.aberta = true;
	}
	
	public void fechar() {
		this.aberta = false;
	}
	
	public void pintarPorta(String cor) {
		this.cor = cor;
		System.out.println("A porta foi pintada de " + cor);
	}
	
	public void estaAberta() {
		if (this.aberta == true) {
			System.out.println("A porta está aberta!");
		} else {
			System.out.println("A porta está fechada!");
		}
	}
}

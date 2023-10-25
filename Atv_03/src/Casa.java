
public class Casa {
	String cor;
	/*boolean porta1;
	boolean porta2;
	boolean porta3;*/
	
	public void addCasa(String cor) {
		this.cor = cor;
		/*this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;*/
	}
	
	public void imprimirCasa() {
		System.out.println("==== Casa ====");
		System.out.println("Cor: " + cor);
	}
	
	public void pintarCasa(String cor) {
		this.cor = cor;
	}
	
	/*public void prtAbertas(int quant) {
		
	}*/
}

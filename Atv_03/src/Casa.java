
public class Casa {
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	public void addCasa(String cor, Porta porta1, Porta porta2, Porta porta3) {
		this.cor = cor;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
	}
	
	public void prtAbertas() {
		int portasAbertas = 0;
		
		if(this.porta1.aberta){
			portasAbertas++;
		}
		if(this.porta2.aberta) {
			portasAbertas++;
		}
		if(this.porta3.aberta) {
			portasAbertas++;
		}
		System.out.println(portasAbertas);
	}
	
	public void imprimirCasa() {
		System.out.println("\n==== Casa ====");
		System.out.println("Cor da casa: " + cor);
		System.out.println("Quantidade de portas abertas: ");
		prtAbertas();
	}
	
	public void pintarCasa(String cor) {
		this.cor = cor;
	}
}

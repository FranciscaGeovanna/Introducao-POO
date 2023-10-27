package Q2;

public class Modelo {
	int cod;
	String descricao;
	
	public void addModelo(int cod, String desc) {
		this.cod = cod;
		this.descricao = desc;
	}
	
	public void imprimirModeloC() {
		System.out.println("Código do modelo: " + cod);
		System.out.println("Descrição do modelo: " + descricao);
	}
}

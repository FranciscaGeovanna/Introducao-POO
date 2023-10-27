package Q2;

public class Marca {
	int cod;
	String descricao;
	
	public void addMarca(int cod, String desc) {
		this.cod = cod;
		this.descricao = desc;
	}
	
	public void imprimirMarcaC() {
		System.out.println("Código da marca: " + cod);
		System.out.println("Descrição da marca: " + descricao);
	}
}

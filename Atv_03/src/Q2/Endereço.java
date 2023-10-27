package Q2;

public class Endereço {
	String rua;
	int num;
	String bairro;
	String cidade;
	
	public void addEndereco(String rua, int num, String bairro, String cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.num = num;
		this.cidade = cidade;
	}
	
	public void imprimirEndereco() {
		System.out.println("Rua: " + rua + "\nNúmero: " + num + "\nBairro: " +
		bairro + "\nCidade: " + cidade);
	}
}

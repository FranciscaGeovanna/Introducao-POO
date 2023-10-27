package Q2;

public class Veiculo {
	String numPlaca;
	String cor;
	int ano;
	String tipoCombustivel;
	int numPortas;
	double quilometragem;
	String renavam;
	String chassis; 
	double valorAlocacao;
	Modelo modelo;
	Marca marca;
	boolean disponivel;
	
	public void addCarro(String numPlaca, String cor, int ano, String tipoCombustivel, int numPortas, double quilometragem, String renavam, String chassis,
	Modelo modelo, Marca marca, boolean disponivel){
		this.numPlaca = numPlaca;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.numPortas = numPortas;
		this.quilometragem = quilometragem;
		this.renavam = renavam;
		this.tipoCombustivel = tipoCombustivel;
		this.disponivel = disponivel;
	}
	
	public void imprimirCarro(){
		System.out.println("\nNúmero da Placa: " + numPlaca + "\nCor do veículo: " + cor + "\nAno: " + ano + "\nNum Portas: " + numPortas + "\nQuilometragem: " + quilometragem +
	    "\nRenavam: " + renavam + "\nTipo Combustível: " + tipoCombustivel);
		System.out.println("-> Marca");
		marca.imprimirMarcaC();
		System.out.println("-> Modelo");
		modelo.imprimirModeloC();
		System.out.println("\nDisponível: " + disponivel);
	}
	
	public void veiculosDisponiveis() {
		if(this.disponivel == true) {
			System.out.println("\n===== VEÍCULOS DISPONÍVEIS =====");
			System.out.println("Placa: " + this.numPlaca);
			marca.imprimirMarcaC();
			modelo.imprimirModeloC();
			System.out.println("Ano: " + ano + "\nPortas: " + numPortas);
		}
	}
}

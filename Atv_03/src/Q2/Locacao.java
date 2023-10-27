package Q2;

public class Locacao {
	Veiculo carroAlocado;
	String dataLocacao;
	String horarioLocacao;
	String dataDev;
	String horarioDev;
	double valorAlocacao;
	Cliente clienteAlocado;
	Cliente nome;
	
	public void addLoc(Veiculo carroAlocado, String dataLocacao, String horarioLocacao, String dataDev, String horarioDev, double valorAlocacao, Cliente clienteAlocado){
		this.carroAlocado = carroAlocado;
		this.clienteAlocado = clienteAlocado;
		this.dataDev = dataDev;
		this.dataLocacao = dataLocacao;
		this.horarioDev = horarioDev;
		this.horarioLocacao = horarioLocacao;
		this.valorAlocacao = valorAlocacao;
	}
	
	public void imprimirLoc(){
		System.out.println("\n===== DADOS DO CLIENTE =====");
		clienteAlocado.imprimirCliente();
		
		System.out.print("\n===== DADOS DO VEÍCULO =====");
		carroAlocado.imprimirCarro(); 
		
		System.out.println("\nData de Alocação: " + dataLocacao + "\nHorário de Locação: " + horarioLocacao + 
		"\nData de Devolução: " + dataDev + "\nHorário de Devolução: " + horarioDev + "\nValor: " + valorAlocacao);
	}
}

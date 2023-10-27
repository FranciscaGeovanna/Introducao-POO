package Q2;

public class Cliente {
	String nome;
	String CPF;
	String telefone;
	Endereço endereco;
	
	public void addCliente(String nome, String cpf, String telefone, Endereço end) {
		this.nome = nome;
		this.CPF = cpf;
		this.telefone = telefone;
		this.endereco = end;
	}
	
	public void imprimirCliente() {
		System.out.println("Nome: " + nome + "\nCPF: " + CPF + "\nTelefone: " + telefone);
		System.out.println("-> Endereço");
		endereco.imprimirEndereco();
	}
	
	public void mostrarNome(){
		System.out.println(nome);
	}
}

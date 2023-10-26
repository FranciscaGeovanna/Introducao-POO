
public class Pessoa {
	String nome;
	int idade;
	
	public void addPessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimirPessoa() {
		System.out.println("==== Dados da pessoa ====");
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
	}
	
	public void aniversario() {
		this.idade = this.idade + 1;
	}
}

public class Atividade03 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.addPessoa("Evangeline", 18);
		
		/*p1.imprimirPessoa();
		p1.aniversario();
		p1.imprimirPessoa();*/
		
		Porta pt1 = new Porta();
		pt1.addPorta(true, "Branca", 2.50, 1.5, 3.5);
		
		/*pt1.abrir();
		pt1.fechar();
		pt1.pintarPorta("Rosa");
		pt1.pintarPorta("Amarelo");
		pt1.pintarPorta("Azul");
		// ALTERAR DIMENSÕES?
		pt1.imprimirPorta();
		pt1.estaAberta();*/
		
		Casa c1 = new Casa();
		c1.addCasa("Roxo");
		c1.imprimirCasa();
		
		c1.pintarCasa("Laranja");
		c1.imprimirCasa();
	}
}

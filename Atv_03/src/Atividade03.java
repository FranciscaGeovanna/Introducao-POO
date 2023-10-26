
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
		
		Porta pt2= new Porta();
		pt2.addPorta(true,"Amarelo", 3.0, 1.8, 3.9);
		
		Porta pt3= new Porta();
		pt3.addPorta(true,"Rosa", 3.6, 2.0, 4.0);
		
		Casa c1 = new Casa();
		c1.addCasa("Roxa", pt1, pt2, pt3);
		c1.imprimirCasa();
		
		c1.pintarCasa("Laranja");
		c1.imprimirCasa();
		pt2.fechar();
		c1.prtAbertas();
		c1.imprimirCasa();
	}
}

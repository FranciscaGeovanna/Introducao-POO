package Q2;

public class LocVeiculo {

	public static void main(String[] args) {
		Endereço e1 = new Endereço();
		e1.addEndereco("Fourth Wing", 543, "Barão de Studant", "Navarre");
		
		Cliente c1 = new Cliente();
		c1.addCliente("Violet", "12345678901", "00987654321", e1);
		
		Modelo md1 = new Modelo();
		md1.addModelo(01, "Siena");
		
		Marca ma1 = new Marca();
		ma1.addMarca(01, "Fiat");
		
		Veiculo v1 = new Veiculo();
		v1.addCarro("B4R81E", "Dourado", 2023, "Gasolina", 4, 15, "1q2w3e4r", "p0o98i7u", md1, ma1, false);
		
		Locacao L1 = new Locacao();
		L1.addLoc(v1, "15/11/2023", "15:00", "15/12/2023", "16:00", 800, c1);
		
		Endereço e2 = new Endereço();
		e2.addEndereco("Terra do Nunca", 49, "Divisão", "Elfhame");
		
		Cliente c2 = new Cliente();
		c2.addCliente("Warner", "09876543217", "00654321679", e2);
		
		Modelo md2 = new Modelo();
		md2.addModelo(02, "Civic");
		
		Marca ma2 = new Marca();
		ma2.addMarca(02, "Honda");
		
		Veiculo v2 = new Veiculo();
		v2.addCarro("T1K34", "Preto", 2024, "Gasolina", 4, 300, "hds5ai23", "4y7u3w1g", md2, ma2, false);
		
		Locacao L2 = new Locacao();
		L2.addLoc(v2, "09/10/2023", "10:00", "09/11/2023", "09:00", 500, c2);
		
		System.out.println("LOCADORA DE VEÍCULOS...");
		
		L1.imprimirLoc();
		L2.imprimirLoc();
		
		
		Modelo md3 = new Modelo();
		md3.addModelo(03, "Gol");
		
		Marca ma3 = new Marca();
		ma3.addMarca(03, "Volkswagen");
		
		Veiculo v3 = new Veiculo();
		v3.addCarro("H50JG", "Prata", 2019, "Gasolina", 4, 180, "h733jsbd", "9dkw28hd", md3, ma3, true);
		
		v3.veiculosDisponiveis();
	}
}

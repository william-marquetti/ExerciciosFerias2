package exercicio10;

public class TesteCasa {
	
	public static void main(String[] args) {
		
		Casa casa1 = new Casa();
		casa1.setCor("Vermelha");
		casa1.getPortas().add(new Porta("azul", 1800d, 1200d, 30d));
		casa1.getPortas().add(new Porta("Amarela", 1544d, 1000d, 25d));
		casa1.getPortas().add(new Porta("Roxa", 600d, 500d, 25d));
		casa1.getPortas().add(new Porta("Preta", 1350d, 1000d, 45d));
		casa1.getPortas().get(0).abre();
		casa1.getPortas().get(3).abre();
		casa1.quantasPortasEstaoAbertas();
		
	}
}

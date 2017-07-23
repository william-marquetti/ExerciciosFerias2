package exercicio10;

public class TestePorta {
	
	public static void main(String[] args) {
		
		Porta porta1 = new Porta("azul", 1800d, 1200d, 30d);
		
		porta1.abre();
		porta1.fecha();
		porta1.setCor("verde");
		porta1.setDimensaoX(1500d);
		porta1.setDimensaoY(1000d);
		porta1.setDimensaoZ(35d);
		porta1.estaAberta();
	
	}

}

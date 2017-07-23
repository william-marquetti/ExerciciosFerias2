package exercicio9;

public class TestePais {
	
	public static void main(String[] args) {
		
		Pais pais1 = new Pais("Brasil", "Brasília", 300000d);
		Pais pais2 = new Pais("Argentina", "Buenos Aires", 200000d);
		Pais pais3 = new Pais("Brasil", "Brasília", 3000005d);
		
		pais1.getFronteira().add("Argentina");
		pais1.getFronteira().add("Chile");
		pais1.getFronteira().add("Paraguai");
		
		if ( pais1.verificaPaisIgual(pais2) == true ){
			System.out.println("São o mesmo país");
		}else{
			System.out.println("Países diferentes");
		}
		
		System.out.println(pais1.getFronteira().toString());
	}

}

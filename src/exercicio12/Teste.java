package exercicio12;

public class Teste {
	
	public static void main(String[] args) {
		
		Gravadora gv1 = new Gravadora("Sr Productions", "Estados Unidos");
		Gravadora gv2 = new Gravadora("Spinning Records", "Suécia");
		
		Banda bd1 = new Banda("RHCP", "Estados Unidos");
		Banda bd2 = new Banda("Millencolin", "Suécia");		
		
		Musica mus1 = new Musica("The Adventures of rain maggie", 180);
		Musica mus2 = new Musica("Fox", 165);
		
		Canta ct1 = new Canta(bd1, mus1, gv1, 2013, "Rock");
		Canta ct2 = new Canta(bd2, mus2, gv2, 2000, "Punk");
		
	}

}

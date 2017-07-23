package exercicio8;

public enum Animais {

		//Gato("Persa"), Cachorro("Pitbull"), Passaro("Canário");
		
		Gato, Cachorro, Passaro;
		public String nomeAnimais;
		
		Animais(){
			
		}
		
		Animais(String nome){
			
			nomeAnimais = nome;
			
		}
		
		public String getNome(){
			return nomeAnimais;
		}
}

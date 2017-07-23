package exercicio8;

public enum Mes {
	
	JANEIRO, FEVEREIRO, MARCO;
	
	public int getDescricao(){
		switch (this){
			
			case JANEIRO: 
				return 1;
				
			case FEVEREIRO : 
				return 2;
		
			case MARCO: 
				return 3;		
			
			default : return 0;
		}
	}

}

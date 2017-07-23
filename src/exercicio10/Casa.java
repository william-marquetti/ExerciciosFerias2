package exercicio10;

import java.util.ArrayList;

public class Casa {

	private String cor;
	private ArrayList<Porta> portas = new ArrayList<Porta>();

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Porta> portas) {
		this.portas = portas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void pinta(String cor){
		this.cor =  cor;
	}

	public int  quantasPortasEstaoAbertas(){
		
		int totalAberta = 0;
		
		for (Porta porta : portas) {
			if (porta.estaAberta()){
				totalAberta++;
			}
		}
		
		return totalAberta;
	}
	
	public int totalDePortas(){
		return portas.size();
		
	}


}

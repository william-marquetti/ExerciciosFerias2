package exercicio9;

import java.util.ArrayList;

public class Pais {

	private String nome;
	private String capital;
	private double area;
	
	private ArrayList<String> fronteira = new ArrayList<String> ();
	
	public Pais(String nome, String capital, double area) {
		this.nome = nome;
		this.capital = capital;
		this.area = area;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getFronteira() {
		return fronteira;
	}

	public void setFronteira(ArrayList<String> fronteira) {
		this.fronteira = fronteira;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public boolean verificaPaisIgual(final Pais outroPais){
		
		boolean igual = false;
		if ( this.capital.equals(outroPais.capital) && this.nome.equals(outroPais.nome) ){
			
			igual = true;
		}
		
		return igual;
	}

}

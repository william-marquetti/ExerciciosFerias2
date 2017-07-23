package exercicio6;

import java.text.SimpleDateFormat;

public class Professor extends Pessoa {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	private char periodo;
	private String materia;

	public char getPeriodo() {
		return periodo;
	}

	public void setPeriodo(char periodo) {
		this.periodo = periodo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void mostraDados(){
		String dados = "";
		
		dados += "Nome: "+ super.getNome();
		dados += "\nData de Nascimento: "+ sdf.format(super.getDataNascimento());
		dados += "\nMatéria: "+ this.materia;
		dados += "\nPeríodo: "+ this.periodo;
		
		System.out.println(dados);
	}
}

package exercicio6;

import java.text.SimpleDateFormat;

public class Aluno extends Pessoa {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	private String serie;
	private char periodo;
	private String turma;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public char getPeriodo() {
		return periodo;
	}

	public void setPeriodo(char periodo) {
		this.periodo = periodo;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public void mostraDados(){
		String dados = "";
		
		dados += "Nome: "+ super.getNome();
		dados += "\nData de Nascimento: "+ sdf.format(super.getDataNascimento());
		dados += "\nSérie: "+ this.serie;
		dados += "\nTurma: "+ this.turma;
		dados += "\nPeríodo: "+ this.periodo;
		
		System.out.println(dados);
	}

}

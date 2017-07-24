package exercicio12;

import java.util.Date;

public class Banda {

	private int codigo;
	private String nome;
	private String pais;
	private Date dataCriacao;
	static int id;
	
	public Banda(String nome, String pais) {
		setNome(nome);
		setPais(pais);
		geraId();
		
	}
	
	private void geraId(){
		id++;
		setCodigo(id);
	}

	public int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}

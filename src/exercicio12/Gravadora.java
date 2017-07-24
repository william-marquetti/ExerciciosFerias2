package exercicio12;

public class Gravadora {

	private String nome;
	private int codigo;
	private String pais;
	static int id;

	public Gravadora(String nome, String pais) {
		setNome(nome);
		setPais(pais);
		geraId();
	}
	
	private void geraId(){
		id++;
		setCodigo(id);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}

package exercicio11;

public class Projeto {

	private int codigo;
	private String nome;
	private int duracao;
	private double custo;
	static int id;
	
	Projeto(String nome, int duracao){
		setNome(nome);
		setDuracao(duracao);
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

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

}

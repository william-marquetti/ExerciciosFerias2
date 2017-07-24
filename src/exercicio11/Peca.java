package exercicio11;

public class Peca {

	private int codigo;
	private String nome;
	private double preco;
	private String cor;
	private int id = 0;
	
	Peca(String nome, String cor){
		setNome(nome);
		setCor(cor);
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}

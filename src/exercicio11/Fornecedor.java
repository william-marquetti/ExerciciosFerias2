package exercicio11;

public class Fornecedor {

	private int codigo;
	private int categoria;
	private String nome;
	private int id = 0;
	
	public Fornecedor(String nome, int categoria) {
		setNome(nome);
		setCategoria(categoria);
		geraId();
	}
	
	private void geraId(){
		id++;
		setCodigo(id);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

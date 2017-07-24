package exercicio11;

public class Cidade {
	
	private int codigo;
	private String nome;
	private int uf;
	static int id;
	
	Cidade(String nome, int uf){
		setNome(nome);
		setUf(uf);
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

	public int getUf() {
		return uf;
	}

	public void setUf(int uf) {
		this.uf = uf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

package exercicio11;

public class FornecedorCidade {

	private Fornecedor fornecedor;
	private Cidade cidade;

	public FornecedorCidade(Cidade cidade, Fornecedor fornecedor) {
		setCidade(cidade);
		setFornecedor(fornecedor);
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	


}

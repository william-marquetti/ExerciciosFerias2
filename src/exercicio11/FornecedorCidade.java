package exercicio11;

public class FornecedorCidade {

	private int codigoFornecedor;
	private int codigoCidade;

	public FornecedorCidade(int codigoCiddade, int codigoFornecedor) {
		setCodigoCidade(codigoCidade);
		setCodigoFornecedor(codigoFornecedor);
	}
	
	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public int getCodigoCidade() {
		return codigoCidade;
	}

	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}

}

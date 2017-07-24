package exercicio11;

public class FornecePara {

	private Peca peca;
	private Fornecedor fornecedor;
	private Projeto projeto;
	private double quantidade;

	FornecePara(Peca peca, Fornecedor fornecedor, Projeto projeto, double quantidade){
		setPeca(peca);
		setFornecedor(fornecedor);
		setProjeto(projeto);
		setQuantidade(quantidade);
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}

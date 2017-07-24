package exercicio11;

public class FornecePara {

	private int peca;
	private int fornecedor;
	private int projeto;
	private double quantidade;

	FornecePara(int peca, int fornecedor, int projeto, double quantidade){
		setPeca(peca);
		setFornecedor(fornecedor);
		setProjeto(projeto);
		setQuantidade(quantidade);
	}

	public int getPeca() {
		return peca;
	}

	public void setPeca(int peca) {
		this.peca = peca;
	}

	public int getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getProjeto() {
		return projeto;
	}

	public void setProjeto(int projeto) {
		this.projeto = projeto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}

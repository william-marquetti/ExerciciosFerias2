package exercicio11;

public class Teste {
	
	public static void main(String[] args) {
		
		Uf uf1 = new Uf("Santa Catarina");
		Uf uf2 = new Uf("São Paulo");
		
		Cidade cidade1 = new Cidade("Blumenau", uf1.getCodigo()); 
		Cidade cidade2 = new Cidade("Campinas", uf2.getCodigo());
		
		Fornecedor for1 = new Fornecedor("Bosch", 2);
		Fornecedor for2 = new Fornecedor("Philips", 3);
		
		FornecedorCidade forCid1 = new FornecedorCidade(cidade2.getCodigo(), for1.getCodigo());
		FornecedorCidade forCid2 = new FornecedorCidade(cidade1.getCodigo(), for2.getCodigo());
		
		Peca peca1 = new Peca("Volante", "Vermelha");
		peca1.setPreco(256d);
		
		Peca peca2 = new Peca("Pneu", "Verde");
		peca2.setPreco(199.99d);
		
		Projeto pj1 = new Projeto("P1", 4);
		pj1.setCusto(1500d);
		
		Projeto pj2 = new Projeto("P2", 2);
		pj2.setCusto(8000d);
		
		FornecePara fp1 = new FornecePara(peca1.getCodigo(), for1.getCodigo(), pj1.getCodigo(), 6d);
		FornecePara fp2 = new FornecePara(peca2.getCodigo(), for2.getCodigo(), pj2.getCodigo(), 4d);
			
	}
}

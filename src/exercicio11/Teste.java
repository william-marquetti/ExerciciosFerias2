package exercicio11;

public class Teste {
	
	public static void main(String[] args) {
		
		Uf uf1 = new Uf("Santa Catarina");
		Uf uf2 = new Uf("São Paulo");
			
		Cidade cidade1 = new Cidade("Blumenau", uf1); 
		Cidade cidade2 = new Cidade("Campinas", uf2);
		
		Fornecedor for1 = new Fornecedor("Bosch", 2);
		Fornecedor for2 = new Fornecedor("Philips", 3);
		
		FornecedorCidade forCid1 = new FornecedorCidade(cidade2, for1);
		FornecedorCidade forCid2 = new FornecedorCidade(cidade1, for2);
		
		Peca peca1 = new Peca("Volante", "Vermelha");
		peca1.setPreco(256d);
		
		Peca peca2 = new Peca("Pneu", "Verde");
		peca2.setPreco(199.99d);
		
		Projeto pj1 = new Projeto("P1", 4);
		pj1.setCusto(1500d);
		
		Projeto pj2 = new Projeto("P2", 2);
		pj2.setCusto(8000d);
		
		FornecePara fp1 = new FornecePara(peca1, for1, pj1, 6d);
		FornecePara fp2 = new FornecePara(peca2, for2, pj2, 4d);
		
	}
}

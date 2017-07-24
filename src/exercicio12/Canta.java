package exercicio12;

public class Canta {

	private int banda;
	private int musica;
	private int gravadora;
	private int ano_gravacao;
	private String estilo;
	
	Canta(int banda, int musica, int gravadora, int ano_gravacao, String estilo){
		setBanda(banda);
		setMusica(musica);
		setGravadora(gravadora);
		setAno_gravacao(ano_gravacao);
		setEstilo(estilo);
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}

	public int getMusica() {
		return musica;
	}

	public void setMusica(int musica) {
		this.musica = musica;
	}

	public int getGravadora() {
		return gravadora;
	}

	public void setGravadora(int gravadora) {
		this.gravadora = gravadora;
	}

	public int getAno_gravacao() {
		return ano_gravacao;
	}

	public void setAno_gravacao(int ano_gravacao) {
		this.ano_gravacao = ano_gravacao;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

}

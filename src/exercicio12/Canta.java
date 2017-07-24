package exercicio12;

public class Canta {

	private Banda banda;
	private Musica musica;
	private Gravadora gravadora;
	private int ano_gravacao;
	private String estilo;
	
	Canta(Banda banda, Musica musica, Gravadora gravadora, int ano_gravacao, String estilo){
		setBanda(banda);
		setMusica(musica);
		setGravadora(gravadora);
		setAno_gravacao(ano_gravacao);
		setEstilo(estilo);
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}

	public Gravadora getGravadora() {
		return gravadora;
	}

	public void setGravadora(Gravadora gravadora) {
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

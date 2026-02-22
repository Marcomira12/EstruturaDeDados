package questao_10;

public class Playlist implements IMusica{
	private String nome_musica;
	private String artista;
	private double tempo;
	
	
	
	public Playlist(String nome_musica, String artista, double tempo) {
		
		this.nome_musica = nome_musica;
		this.artista = artista;
		this.tempo = tempo;
	}
	public String getNome_musica() {
		return nome_musica;
	}
	public void setNome_musica(String nome_musica) {
		this.nome_musica = nome_musica;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	@Override
	public boolean adicionar() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean lsitar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

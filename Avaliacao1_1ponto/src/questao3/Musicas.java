package questao3;

public class Musicas {
	private String nameMusica;

	public Musicas(String nameMusica) {
		super();
		this.nameMusica = nameMusica;
	}

	public String getNameMusica() {
		return nameMusica;
	}

	public void setNameMusica(String nameMusica) {
		this.nameMusica = nameMusica;
	}

	@Override
	public String toString() {
		return "Musicas [nameMusica=" + nameMusica + "]";
	}
	
	
}

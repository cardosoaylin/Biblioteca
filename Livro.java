package lista;


public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicaçao;
	
	public Livro(String titulo, String autor, int anoPublicaçao){
		this.titulo=titulo;
		this.autor=autor;
		this.anoPublicaçao=anoPublicaçao;
	}
     	
	@Override
	public String toString() {
		return "Livro: Título = "  + titulo + ", Autor = "  + autor + ", Ano de Publicação = "  + anoPublicaçao + "]\n";
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	public int getAnoPublicaçao() {
		return anoPublicaçao;
	}
	public void setAnoPublicaçao(int anoPublicaçao) {
		this.anoPublicaçao = anoPublicaçao;
		
	}
	
	
	
	
	
	

	

}

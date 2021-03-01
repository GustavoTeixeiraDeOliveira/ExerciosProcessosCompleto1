
public class Livros {
	String[] Titulo;
	int[] Exemplares;
	
	public Livros(int tamanho) {
		Titulo = new String[tamanho];
		Exemplares = new int [tamanho];
	}
	
	public void setTitulo(String titulo, int indice) {
		Titulo[indice] = titulo;
	}
	
	public void setExemplares(int exemplares, int indice) {
		Exemplares[indice] = exemplares;
	}
	
	public String getTitulo(int indice) {
		return Titulo[indice];
	}
	
	public int getExemplares(int indice) {
		return Exemplares[indice];
	}

}

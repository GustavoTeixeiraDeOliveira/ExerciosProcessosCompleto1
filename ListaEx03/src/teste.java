

public class teste {
	ClasseLista  Lista = new ClasseLista();
	ClassePilha  Pilha = new ClassePilha();
	
	public void RemoveLista() {
		int aux;
		aux = Lista.RemoverLista();
		Pilha.AdicionaPilha(aux);
	}
	
	public void RemovePilha() {
		int aux;
		aux = Pilha.RemovePilha();
		Lista.AdicionaLista(aux);
	}


}

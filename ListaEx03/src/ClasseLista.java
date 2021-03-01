
public class ClasseLista {
	int dados[] = new int[5];
	int tamanho = 0;
	int indice = 0;
	
	
	public void AdicionaLista(int e){     

		if (tamanho<dados.length){
			dados[tamanho]=e;                     
			tamanho++; 
			
		}
		else{
			System.out.println("Lista Cheia");    
		}
	}
	
	public int RemoverLista() {
		int retorno = 0;
		int i;
		if(dados[0] == 0) {
			 System.out.println("não existe valor nessa posição");
		}
		else if (tamanho>=1){                              
			retorno=dados[0];
			for (i=1;i<tamanho;i++){                      
				dados[i-1]=dados[i];                          
			}
			tamanho--;                                   
		}
		return retorno;
	}
	
	public  boolean verificarListaVazia() {
		boolean verifi;
		if(tamanho == 0){
			verifi = true;
		}else {
			verifi = false;
		}
		return verifi;
	}
	
	public boolean verificarListaCheia() {
		boolean verifi;
		if(tamanho == dados.length){
			verifi = true;
		}else {
			verifi = false;
		}
		return verifi;
	}

}

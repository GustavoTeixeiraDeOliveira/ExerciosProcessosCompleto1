
public class ClassePilha {
	int dados[] = new int[5];
	int tamanho = 0;
	int indice = 0;
	
	public void AdicionaPilha(int e){     

		if (tamanho<dados.length){
			dados[tamanho]=e;                     
			tamanho++; 
			
		}
		else{
			System.out.println("Lista Cheia");    
		}
	}
	
	public int RemovePilha(){
		int retorno = 0;
		int i;
		if(dados[tamanho-1] == 0 || tamanho == 0) {
			 System.out.println("Não existe valor nessa posição");
		}
		else if (tamanho>=1){                              
			retorno=dados[tamanho-1];
			dados[tamanho-1] = 0;
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1) {                             
					tamanho--; 
				}                                   
			}                                 
		}
		return retorno;
	}
}

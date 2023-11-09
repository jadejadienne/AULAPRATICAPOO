package total;

public class comparaçãovalores {
	
	public int totalPares(int [] valores){
		int cont = 0;
		
		for (int i = 0; i < valores.length; i++){
			if(valores[i]%2==0){
				cont++;			
		
  }
							
		}
		return cont;
	}
	
	public int maiorvalor(int [] valores){
		int maior = 0;
		
		for (int i = 0; i < valores.length; i++){
			if(valores[i] > maior){
				 maior = valores[i];			
			
			}
		}
		return maior;
		
	}
	
public int quaniguais(int [] v1, int [ ]v2){
	int cont = 0;
	for(int i = 0; i < v1.length; i++){
		for(int j = 0; j < v2.length; j++){
			if(v1[1] == v2[j]){
				cont++;
			}
		}
	}
	return cont;
	
}
	
}

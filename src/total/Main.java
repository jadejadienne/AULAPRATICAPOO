package total;

public class Main {

	public static void main(String[] args) {

		
comparaçãovalores cv = new comparaçãovalores();
		
		int [] v1 = new int[10];
		int [] v2 = new int[10];
		
		
		
		for(int i=0; i < v1.length; i++){
			v1[i]=(i*i)+1;
			v2[i]=(i*i);
			
		}
		
		int resultado = cv.totalPares(v1);
		System.out.println(resultado);
		
		int maior = cv.maiorvalor(v1);
		System.out.println("o maior valor: " + maior);
		
		int Mai = cv.quaniguais(v1, v2);
		System.out.println("o maior valor: " + Mai);
		

	}

}

package exercicioav1;

public class anagrama{
	public static void main(String args[]){   
		int i,igual,igual2,j,tam;
		boolean anagrama = true;	    
		tam = Input.readInt("Tamanho das palavras: ");
		char vetorA [] = new char[tam], vetorB [] = new char[tam];
       
		for(i=0;i<tam;i++)
			vetorA[i] = Input.readChar("Valor A["+i+"]: ");

        for(i=0;i<tam;i++)
			System.out.println("Valor A["+i+"]: "+vetorA[i]);

		System.out.println("\n");

        for(i=0;i<tam;i++)
			vetorB[i] = Input.readChar("Valor B["+i+"]: ");

        for(i=0;i<tam;i++)
			System.out.println("Valor B["+i+"]: "+vetorB[i]);

		System.out.println("\n");
                i=0;
 
		while(i<tam && anagrama == true){
			
			igual=0;
			for(j=0;j<tam;j++){
				if(vetorA[j] == vetorA[i])
					igual++;
            }

			igual2=0;
            for(j=0;j<tam;j++){
				if(vetorB[j] == vetorA[i])
					igual2++;
            }

            if(igual != igual2)
				anagrama = false;

			i++;
		}

		if(anagrama == true)
			System.out.println("As palavras sao anagramas");
        else
        	System.out.println("As palavras NAO sao anagramas");
	}
}
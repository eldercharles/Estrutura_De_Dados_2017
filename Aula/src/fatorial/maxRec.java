package fatorial;

public class maxRec{

	public static void inicializeVetor(int vet[], int qtd){
		for(int i=0;i<qtd;i++)
			vet[i]= Input.readInt("Digite o elemento "+i+" do vetor: ");
	}

	public static int maxRec(int vet[],int qtd){
		int max;
		if(qtd==0)
			max=vet[0];
		else{
			max  = maxRec(vet,qtd-1);
			if(max < vet[qtd])
				max = vet[qtd];
		}
		return max;
	} 
	
	public static void main(String args[]){
		int qtd, vet[];
		qtd = Input.readInt("Digite a quantidade de numeros no vetor: ");
		vet    = new int[qtd];		
		inicializeVetor(vet,qtd);
		System.out.println("O maior elemento do vetor eh: "+maxRec(vet,qtd-1));		
	}

}
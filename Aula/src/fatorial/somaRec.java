package fatorial;

public class somaRec{

	public static void inicializeVetor(int vet[], int qtd){
		for(int i=0;i<qtd;i++)
			vet[i]= Input.readInt("Digite o elemento "+i+" do vetor: ");
	}
	
	public static int somaRec(int vet[], int qtd){
		int r;
		
		if(qtd==-1)
			r=0;
		else
			r=vet[qtd] + somaRec(vet,qtd-1);
		
		return r;
	}
	
	
	public static void main(String args[]){
		int qtd, vet[];
		qtd = Input.readInt("Digite a quantidade de numeros no vetor: ");
		vet    = new int[qtd];		
		inicializeVetor(vet,qtd);
		System.out.println("O resultado da soma de todos os elementos do vetor eh: "+somaRec(vet,qtd-1));
	}
}
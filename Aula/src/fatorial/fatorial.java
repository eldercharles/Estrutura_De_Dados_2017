package fatorial;

public class fatorial{
	
	public static int calculaFatorial(int numero){
		int fat=1;
		if(numero==0 || numero==1)
			return 1;
		
		while(numero>1){
			fat *= numero;
			numero--;
		}
		return fat;
	}
	
	public static void main(String args[]){
	
			int numero;
			numero = Input.readInt("Digite o numero a calcular o fatorial: ");
			System.out.println("O resultado do calculo do fatorial eh "+calculaFatorial(numero));
	}

}
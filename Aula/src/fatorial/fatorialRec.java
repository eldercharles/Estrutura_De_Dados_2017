  package fatorial;

public class fatorialRec{
	
	public static int calculaFatorial(int numero){
		System.out.println("Chamada para o numero "+numero);
		if(numero>1)
			return numero * calculaFatorial(numero-1); 
		else 
			return 1;
	}
	
	public static void main(String args[]){
	
			int numero;
			numero = Input.readInt("Digite o numero a calcular o fatorial: ");
			System.out.println("O resultado do calculo do fatorial eh "+calculaFatorial(numero));
	}
}


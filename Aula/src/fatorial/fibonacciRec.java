package fatorial;

public class fibonacciRec{

	public static int calculaFibonacci(int numero){
		if(numero>=3)
			return calculaFibonacci(numero-1) + calculaFibonacci(numero-2);
		else
		
			return 1;
	} 
	
	public static void main(String args[]){
		int pen,ult,fib,numero;
		numero = Input.readInt("Digite o numero que deseja saber o Fibonacci: ");
		System.out.println("O "+numero+" numero da sequencia de Fibonacci eh: "+calculaFibonacci(numero));
	}
}
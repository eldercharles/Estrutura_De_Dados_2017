package fatorial;

public class fibonacci{

	public static int calculaFibonacci(int numero){
		int pen=1,ult=1,fib=0,cont;
		cont = 1;
		while(cont < numero){
			fib=ult+pen;
			pen = ult;
			ult = fib;
			cont++;
		}
		return fib;
	}
	
	public static void main(String args[]){
		int pen,ult,fib,numero;
		numero = Input.readInt("Digite o numero que deseja saber o Fibonacci: ");
		System.out.println("O "+numero+" numero da sequencia de Fibonacci eh: "+calculaFibonacci(numero));
	}
}
package fatorial;

public class impressaoRec{

	public static void imprimeNumero(int numero){
		System.out.println(numero+" ");
		if(numero>1)
			imprimeNumero(numero-1);
	}
            
	public static void main(String args[]){
		int numero;
		numero = Input.readInt("Digite o numero que deseja imprimir de maneira decrescente ate 1: ");
		imprimeNumero(numero);
	}
}
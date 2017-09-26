package exercicioav1;

public class pilhavet{
	
	public int pilha[];
	public int topo;
	public int tam;
	
	pilhavet(int tam){
		pilha = new int[tam];
		topo  = -1;
		this.tam = tam;
	}
	
	public void empilha(int valor){
		if(topo<tam-1){
			pilha[++topo]=valor;
			System.out.println("Empilhado valor: "+valor);
		}else
			System.out.println("Pilha lotada!");		
	}
	
	public void desempilha(){
		if(topo>=0){
			System.out.println("Desempilhado valor: "+pilha[topo--]);
		}else
			System.out.println("Pilha vazia!");				
	}
	
	public void imprime(){
		int i;
		System.out.println("Impressao: ");
		for(i=topo;i>=0;i--)
			System.out.println(pilha[i]);
	}
	public void menu(){
		int valor,opcao=0,n;
		System.out.print("\n------------ Menu ------------\n");
		while(opcao!=-1){
			opcao = Input.readInt("\nDigite a opcao: \n(1) Empilha \n(2) Desempilha \n(3) Imprime \n(-1) Sair \nOpcao: ");
			switch(opcao){
			
				case 1: //empilha
					valor = Input.readInt("Valor: ");
					empilha(valor);
				break;
				
				case 2: //desempilha
					desempilha();
				break;
				
				case 3: //imprime
					imprime();
				break;
				                                    
				case -1: //sair
					System.out.println("Saindo!");
				break;
				
				default:
					System.out.println("Opcao invalida!");
				break;
			}
		}			
	}
	public static void main(String args[]){
			pilhavet pv;
			pv = new pilhavet(100);
			pv.menu();
	}
}
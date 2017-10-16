
package ProvaAV1;


public class LetraB {
    
    public listaencadeada.fila.tipoNo cabeca;
	LetraB(){
		System.out.println("Criando fila...(construtor fila)");
	}
	
	
	public void insereInicio(int info){
		if(cabeca == null){
			cabeca      = new listaencadeada.fila.tipoNo();
			cabeca.setInfo(info);
			cabeca.setProx(null);
		}
		else{
			listaencadeada.fila.tipoNo novo;
			novo = new listaencadeada.fila.tipoNo();
			novo.setInfo(info);
			novo.setProx(cabeca);
			cabeca = novo;
		}
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
	
        	
	public void insereFinal(int info){
           
		if(cabeca == null){
			cabeca = new listaencadeada.fila.tipoNo();
			cabeca.setInfo(info);
			cabeca.setProx(null);
		}
		else{
			listaencadeada.fila.tipoNo aux,novo;
			
			novo = new listaencadeada.fila.tipoNo();
			novo.setInfo(info);
			novo.setProx(null);
						
			aux = cabeca;
			while(aux.getProx()!=null)
				aux=aux.getProx();
			
			aux.setProx(novo);
		}
		
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
        
        
	public void removeInicio(){
		if(cabeca!=null){
			int valor=cabeca.getInfo();
			System.out.println("Elemento "+valor+" removido com sucesso! ");
			cabeca=cabeca.getProx();
		}
	}
	
	public void removeFinal(){
		if(cabeca!=null){
			if(cabeca.getProx()==null){
				int valor=cabeca.getInfo();
				System.out.println("Elemento "+valor+" removido com sucesso! ");
				cabeca = null;
			}
			else{
				listaencadeada.fila.tipoNo aux;
				aux = cabeca;
				while((aux.getProx()).getProx()!=null)
					aux=aux.getProx();
				int valor=(aux.getProx()).getInfo();
				System.out.println("Elemento "+valor+" removido com sucesso! ");
				aux.setProx(null);
			}
		}
	}
	
	public void imprime(){
		listaencadeada.fila.tipoNo aux=cabeca;
		System.out.println("Impressao: ");
		while(aux!=null){
			System.out.print(aux.getInfo()+" ");
			aux=aux.getProx();
		}
		System.out.println("");
	}
	
	public void menu(){
		int valor,opcao=0;
		System.out.print("\n------------ Menu ------------\n");
		while(opcao!=-1){
			opcao = listaencadeada.fila.Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime\n(6) Imprime Terceiro\n(-1) Sair \nOpcao: ");
			switch(opcao){
			
				case 1: //insereInicio
					valor = listaencadeada.fila.Input.readInt("Valor: ");
					insereInicio(valor);
				break;
				
				case 2: //insereFinal
					valor = listaencadeada.fila.Input.readInt("Valor: ");
					insereFinal(valor);
				break;
				
				case 3: //removeInicio
					removeInicio();
				break;
				
				case 4: //removeFinal
					removeFinal();
				break;
				
				case 5: //imprime
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
		System.out.println("\n************ Lista Encadeada Din�mica ************\n");
		LetraB F = new LetraB();
		F.menu();
		System.out.println("\n************ Fim programa ************\n");
	}
}



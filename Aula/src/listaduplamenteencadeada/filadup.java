package listaduplamenteencadeada;

public class filadup{
	
	public tipoNoDup cabeca;
		
	filadup(){}
		
	public void insereFinal(int info){
		if(cabeca == null){
			cabeca      = new tipoNoDup();
			cabeca.setInfo(info);
			cabeca.setProx(null);
			cabeca.setAnt(null);
		}
		else{
			tipoNoDup aux,novo;
			aux = cabeca;
			
			while(aux.getProx()!=null)
				aux=aux.getProx();
			
			novo      = new tipoNoDup();
			novo.setInfo(info);
			novo.setProx(null);
			novo.setAnt(aux);
			aux.setProx(novo);
		}
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
	
	public void insereInicio(int info){
		if(cabeca == null){
			cabeca      = new tipoNoDup();
			cabeca.setInfo(info);
			cabeca.setProx(null);
			cabeca.setAnt(null);
		}
		else{
			tipoNoDup novo;
			novo      = new tipoNoDup();
			novo.setInfo(info);
			novo.setProx(cabeca);
			novo.setAnt(null);
			cabeca.setAnt(novo); 
			cabeca    = novo;
		}
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
	
	public void removeInicio(){
		if(cabeca!=null){
			int valor = cabeca.getInfo();
			cabeca=cabeca.getProx();
			
			if(cabeca!=null)
				cabeca.setAnt(null);
			
			System.out.println("Elemento "+valor+" removido com sucesso! ");
		}
	}
	
	public void removeFinal(){
		if(cabeca!=null){
			tipoNoDup aux;			
			
			if(cabeca.getProx()==null){
				int valor = cabeca.getInfo();
				cabeca = null;
				System.out.println("Elemento "+valor+" removido com sucesso! ");
			}
			else{
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
		tipoNoDup aux=cabeca;
		System.out.println("Impressao: ");
		while(aux!=null){
			System.out.print(aux.getInfo()+" ");
			aux=aux.getProx();
		}
		System.out.println("");
	}
	
	public void menu(){
		int valor,opcao=0;
		
		while(opcao!=-1){
			opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime \n(-1) Sair \nOpcao: ");
			switch(opcao){
			
				case 1:
					valor = Input.readInt("Valor: ");
					insereInicio(valor);
				break;
				
				case 2:
					valor = Input.readInt("Valor: ");
					insereFinal(valor);
				break;
				
				case 3:
					removeInicio();
				break;
				
				case 4:
					removeFinal();
				break;
				
				case 5:
					imprime();
				break;
				
				case -1:
					System.out.println("Saindo!");
				break;
				
				default:
					System.out.println("Opcao invalida!");
				break;
			
			}
		
		}
	}

	public static void main(String args[]){
		filadup F = new filadup();
		F.menu();
	}
}
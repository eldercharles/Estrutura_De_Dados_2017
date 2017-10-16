package ProvaAV1;


public class LetraD {
    
public tipoNo cabeca;
	LetraD(){
		System.out.println("Criando fila...(construtor fila)");
	}
public void insereFinalCirco(int info){
		if(cabeca == null){
		   cabeca = new tipoNo();
		   cabeca.setInfo(info);
		   cabeca.setProx(cabeca);
		}
		else{
			tipoNo aux,novo;
			
			novo = new tipoNo();
			novo.setInfo(info);
			novo.setProx(cabeca);
						
			aux = cabeca;
			while(aux.getProx()!=cabeca)
				aux=aux.getProx();
			
			aux.setProx(novo);
		}
		
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
        
        	
	public void insereInicioCirco(int info){
		if(cabeca == null){
			cabeca = new tipoNo();
			cabeca.setInfo(info);
			cabeca.setProx(cabeca);
		}
		else{
			tipoNo aux, novo;
                        
			novo = new tipoNo();
			novo.setInfo(info);
			novo.setProx(cabeca);
                        
			aux = cabeca;
                        while (aux.getProx() !=cabeca)
                            aux=aux.getProx();
                        
                       aux.setProx (novo);
                       cabeca= novo;
		}
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
	
        public int BuscaElemento (int info) {
            int i = 0;
            while (i < info) {
                if (i == 1 )
                    return i;
                else i++;
            }
            return -1;
        }
        
        
	public void removeInicioCirco(){
		if(cabeca!=null){
                    
                    if (cabeca.getProx() == cabeca) {
                        cabeca=null;
                    }else {
                        
                        tipoNo aux;
                        aux = cabeca;
                        
                        while(aux.getProx()!=cabeca)
                            aux = aux.getProx();
                        
                        aux.setProx(cabeca.getProx());
                        int valor = cabeca.getInfo();
                        cabeca = cabeca.getProx();
                        System.out.println("Removido: "+valor);
                    }
		
                }
        }
	
	public void removeEnesimoCirco(){
		if(cabeca!=null){
			if(cabeca.getProx()==null){
				int valor=cabeca.getInfo();
				System.out.println("Elemento "+valor+" removido com sucesso! ");
				cabeca = null;
			}
			else{
				tipoNo aux;
				aux = cabeca;
				while((aux.getProx()).getProx()!=null)
					aux=aux.getProx();
				int valor=(aux.getProx()).getInfo();
				System.out.println("Elemento "+valor+" removido com sucesso! ");
				aux.setProx(null);
			}
		}
	}
	
	public void imprimeCirco(){
            System.out.println("Impressao: ");
            if (cabeca!=null) {
		tipoNo aux=cabeca;
		System.out.println(aux.getInfo() +"");
                aux=aux.getProx();
                
		while(aux!=cabeca){
			System.out.print(aux.getInfo()+" ");
			aux=aux.getProx();
		}
		System.out.println("");
	}
        }
	
	public void menu(){
		int valor,opcao=0;
		System.out.print("\n------------ Menu ------------\n");
		while(opcao!=-1){
			opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime\n(6) Imprime Terceiro\n(-1) Sair \nOpcao: ");
			switch(opcao){
			
				case 1: //insereInicio
					valor = Input.readInt("Valor: ");
					insereInicioCirco(valor);
				break;
				
				case 2: //insereFinal
					valor = Input.readInt("Valor: ");
					insereFinalCirco(valor);
				break;
				
				case 3: //removeInicio
					removeInicioCirco();
				break;
				
				case 4: //removeFinal
					removeEnesimoCirco();
				break;
				
				case 5: //imprime
					imprimeCirco();
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
		LetraD F = new LetraD();
		F.menu();
		System.out.println("\n************ Fim programa ************\n");
	}
}
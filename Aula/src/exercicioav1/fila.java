package exercicioav1;

public class fila{
	
	public tipoNo cabeca;
	fila(){
		System.out.println("Criando fila...(construtor fila)");
	}
		
	public void insereFinal(int info){
		if(cabeca == null){
			cabeca = new tipoNo();
			cabeca.setInfo(info);
			cabeca.setProx(null);
		}
		else{
			tipoNo aux,novo;
			
			novo = new tipoNo();
			novo.setInfo(info);
			novo.setProx(null);
						
			aux = cabeca;
			while(aux.getProx()!=null)
				aux=aux.getProx();
			
			aux.setProx(novo);
		}
		
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
	
        /****************************************/
        public void insereFinalCirc(int info){
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
        
        
        public void insereInicioCirc(int info){
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
                        cabeca=novo;
		}
		
		System.out.println("Elemento "+info+" inserido com sucesso! ");
            
        }
        
        /****************************************/
	public void insereInicio(int info){
		if(cabeca == null){
			cabeca      = new tipoNo();
			cabeca.setInfo(info);
			cabeca.setProx(null);
		}
		else{
			tipoNo novo;
			novo = new tipoNo();
			novo.setInfo(info);
			novo.setProx(cabeca);
			cabeca = novo;
		}
		System.out.println("Elemento "+info+" inserido com sucesso! ");
	}
	
	
	
        /***********************/       
        public void removeInicioCirc(){
        
            if(cabeca!=null){
                
                if(cabeca.getProx() == cabeca){
                    cabeca=null;
                }else{
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
        
        /***********************/
        
        public void imprimeCirc(){
         
            System.out.println("Impressao: ");
            if(cabeca!=null){
                tipoNo aux=cabeca;
                System.out.print(aux.getInfo()+" ");
                aux=aux.getProx();
             
                while(aux!=cabeca){
                    System.out.print(aux.getInfo()+" ");
                    aux=aux.getProx();
                }
                System.out.println("");
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
	
        public void removenesimo(int n){
        
            if(cabeca == null){
                System.out.println("Lista vazia!");
            }else{
                //remocao do primeiro
                int valor;
                if(n==1){
                    valor = cabeca.getInfo();
                    cabeca = cabeca.getProx();
                    System.out.println("Valor "+valor+" removido!");
                }else{
                    int pos=1;
                    tipoNo aux;
                    aux = cabeca;
                    
                    while(aux.getProx()!=null && pos != n-1){
                        aux = aux.getProx();
                        pos++;
                    }
                    if(aux.getProx()!=null){
                        valor = aux.getProx().getInfo();
                        aux.setProx(aux.getProx().getProx());
                        System.out.println("Valor "+valor+" removido!");
                    }else{
                        System.out.println("Posicao inexistente!");
                    }
                } 
            
            }
                
        
        }
	public void imprime(){
		tipoNo aux=cabeca;
		System.out.println("Impressao: ");
		while(aux!=null){
			System.out.print(aux.getInfo()+" ");
			aux=aux.getProx();
		}
		System.out.println("");
	}
	
	public void menu(){
		int valor,opcao=0,n;
		System.out.print("\n------------ Menu ------------\n");
		while(opcao!=-1){
			opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime\n(6) Remove n-esimo\n(7) Insere Circ\n(8) Remove Circ\n(9) Imprime Circ\n(-1) Sair \nOpcao: ");
			switch(opcao){
			
				case 1: //insereInicio
					valor = Input.readInt("Valor: ");
					insereInicio(valor);
				break;
				
				case 2: //insereFinal
					valor = Input.readInt("Valor: ");
					insereFinal(valor);
				break;
				
				case 3: //removeInicio
					//removeInicio();
				break;
				
				case 4: //removeFinal
					removeFinal();
				break;
				
				case 5: //imprime
					imprime();
				break;
				
                                case 6:
                                        n = Input.readInt("Digite o n-esimo: ");
                                        removenesimo(n);
                                break;
                                        
                                case 7:
                                        valor = Input.readInt("Valor: ");
                                        insereFinalCirc(valor);
                                break;
                                case 8:
                                    removeInicioCirc();
                                break;
                                
                                case 9:
                                    imprimeCirc();
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

	public tipoNo getCabeca(){
			return cabeca;
	}
	
	public void setCabeca(tipoNo no){
		cabeca=no;
	}
	
	public void concatena(fila f2){
		tipoNo aux;
		aux=cabeca;
		
		if(aux!=null){
			while(aux.getProx()!=null)
				aux=aux.getProx();
			aux.setProx(f2.getCabeca());
		}else{
			cabeca=f2.getCabeca();
		}
		this.imprime();	
	}
	public void divideFila(){
		int i,pos;
		tipoNo aux;
		
		fila f2;
		f2 = new fila();
		
		pos = Input.readInt("Digite a pos: ");
		i=1;
		aux=cabeca;
		while(i != pos){
			aux = aux.getProx();
			i++;
		}
		f2.setCabeca(aux.getProx());
		aux.setProx(null);
		this.imprime();
		f2.imprime();
		
	}
	
	public void novaordenada(fila f2){
		fila f3;
		f3   = new fila();
		tipoNo aux,aux2;
		
		aux  = cabeca;
		aux2 = f2.getCabeca(); 
		while(aux!=null && aux2!=null){	
			if(aux.getInfo() < aux2.getInfo()){
				f3.insereFinal(aux.getInfo());
				aux = aux.getProx();
			}else{
				f3.insereFinal(aux2.getInfo());
				aux2 = aux2.getProx();
			}
		}
		if(aux==null){
			while(aux2!=null){
				f3.insereFinal(aux2.getInfo());
				aux2 = aux2.getProx();
			}
		}else{
			while(aux!=null){
				f3.insereFinal(aux.getInfo());
				aux = aux.getProx();
			}	
		}
		f3.imprime();
	}
	
	public static void main(String args[]){
		fila F1 = new fila();
		F1.menu();
		
		fila F2 = new fila();
		F2.menu();
		
		/*F1.novaordenada(F2);
		*/
		//F1.divideFila();
		F1.concatena(F2);
		System.out.println("\n************ Fim programa ************\n");
	}
}
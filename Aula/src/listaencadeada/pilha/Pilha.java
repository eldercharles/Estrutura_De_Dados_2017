
package listaencadeada.pilha;


public class Pilha {


    public tipoNo topo;
      Pilha (){
             System.out.println("Criando Pilha");     
      }
      public  void insere (int elemento) {
      
	
		        if(topo == null){
			topo = new tipoNo();
			topo.setelemento(elemento);
			topo.setProx(null);
		}
		else{
			tipoNo novo;
			
			novo = new tipoNo();
                        novo.setelemento(elemento);
			novo.setProx(topo);
                        topo  = novo;
			
                
                }
                
                System.out.println("Elemento " +elemento+ " inserido");
                
        } 
        
             
}

 
  
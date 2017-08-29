package listaencadeada.pilha;


public class tipoNo {
   	public int elemento;
	public tipoNo prox;
	
	public tipoNo(){}
	
	public void setelemento(int elemento){
		this.elemento=elemento;
	}

	public void setProx(tipoNo prox){
		this.prox=prox;
	}
	
	public int getelemento(){
		return elemento;
	}
	public tipoNo getProx(){
		return prox;
	}

	
}
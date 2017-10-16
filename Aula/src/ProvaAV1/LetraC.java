
package ProvaAV1;

import java.util.Scanner;


public class LetraC {

  public tipoNo cabeca;
  
  public void InsereInicio(String info) {
      
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            
        } else {
            
            tipoNo aux, novo;
            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);
            aux = cabeca;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novo);
        }
    }
  public void InverterLista() {
      
        tipoNo aux = cabeca;
        tipoNo auxdois = null;
        tipoNo proxAux = null;
        while (aux != null) {
            proxAux = aux.getProx();
            aux.setProx(auxdois);
            auxdois = aux;
            aux = proxAux;
        }
        
        cabeca = auxdois;
  }
    public void imprime() {
        
        tipoNo aux = cabeca;
        System.out.print("Impressão: ");
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
    }
  
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        LetraC principal = new LetraC();

        int elemento = 0;
        int quantidade = 0;
        
        System.out.print(" Qde elementos a serem inseridos: ");
        quantidade = sc.nextInt();
        
        System.out.print("Insira o primeiro elemento: ");
        while (quantidade > 0) {
            
        principal.InsereInicio(sc.next());
        System.out.print(elemento + "º Elemento inserido com sucesso! ");
        quantidade--;
        if (quantidade == 0) continue;
        System.out.print("Insira mais 1! ");
        elemento++;
        }
        
      
        principal.InverterLista();
        System.out.print(" Invertida é: ");
           

    }
   }
  

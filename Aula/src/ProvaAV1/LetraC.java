
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
  public void InverteLista() {
        tipoNo aux = cabeca;
        tipoNo aux2 = null;
        tipoNo proxAux = null;
        while (aux != null) {
            proxAux = aux.getProx();
            aux.setProx(aux2);
            aux2 = aux;
            aux = proxAux;
        }
        cabeca = aux2;
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
        System.out.print(" Quantidade de elementos a serem inseridos: ");
        quantidade = sc.nextInt();
        System.out.print("Insira o primeiro elemento: ");
        while (quantidade > 0) {
            principal.InsereInicio(sc.next());
            System.out.print(elemento + "º Elemento inserido com sucesso! ");
            quantidade--;
            if (quantidade == 0) continue;
            System.out.print("Insira mais um! ");
            elemento++;
        }
        
      
        principal.InverteLista();
        System.out.print("\n\n Lista invertida é: ");
           

    }
   }
  

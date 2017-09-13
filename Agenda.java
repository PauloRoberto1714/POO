
package oo;

public class Agenda {
    Pessoa1[] p = new Pessoa1[10];
    int total = 0;
    
    public void armazenar(String nome,int idade, float altura ){
       p[total] = new Pessoa1(nome, idade, altura);
       total++;
   }
    
    public void remover(String nome){
        for (int i = 0; i <= total-1; i++) {
            if (p[i].nome == nome) {
                p[i] = null;
                System.out.println("Removido");
                total--;
                System.out.println("-----------------");
            }
        }
    }
    
    public void buscarPessoa(String nome){
        for (int i = 0; i <= total-1; i++) {
            if(p[i].nome == nome){
                System.out.println("Posição: "+i);
                System.out.println("-----------------");
            }
        }
    }
    
    public void imprimirAgenda(){
        for (int i = 0; i <= total-1; i++) {
            System.out.println(p[i].nome);
            System.out.println(p[i].idade);
            System.out.println(p[i].altura);
        }
        System.out.println("-----------------");
    }
    
    public void imprimirPessoa(int index){
        System.out.println(p[index].nome);
        System.out.println(p[index].idade);
        System.out.println(p[index].altura);
        System.out.println("-----------------");
    }

   
   
}

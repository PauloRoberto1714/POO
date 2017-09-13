package oo;

public class Main_Agenda {
    public static void main(String[] args) {
        Agenda ag = new Agenda();
        
        ag.armazenar("paulo", 21, 1.64f);
        ag.buscarPessoa("paulo");
        
        ag.imprimirAgenda();
        
        
    }
 
}

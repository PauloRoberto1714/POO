package classes;

public class Banco {
    public static void main(String[]args){
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.nome = "paulo";
        pessoa1.cpf = "04457649376";
        pessoa1.telefone = "(85)98501-9130";
        pessoa1.agencia = 493;
        pessoa1.salario = (float) 937.96;
       
        pessoa1.status();
        pessoa1.depositar(500);
        pessoa1.verifSaldo();
        
    }
}

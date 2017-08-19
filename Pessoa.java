package classes;

public class Pessoa {

    String nome;
    String cpf;
    String rg;
    String titulo;
    String endereco;
    String matricula;
    String telefone;
    String curso;
    String email;
    int agencia;
    int ano_nasc;
    float altura;
    float peso;
    float salario;
    float saldo;
    
    
    public void sacar(float valorSaque){
        float novoSaldo = saldo - valorSaque;
        this.saldo = novoSaldo;
    }
    public void depositar(float valorDepos){
        float novoSaldo = saldo + valorDepos;
        this.saldo = novoSaldo;
    }
    public void verifSaldo(){
        System.out.println("Saldo da Conta: " + saldo);
    }
    public void idade(){
        int idade = 2017 - ano_nasc;
        System.out.println("Idade: " + idade);
    }
    
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Telefeone: " + this.telefone);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Salário: " + this.salario);
        
    }
    
}

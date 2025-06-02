package juliaericalista.Questao02;
import juliaericalista.Questao02.ContaBancaria;
import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        
        Scanner teste = new Scanner (System.in);
        
        ContaBancaria conta = new ContaBancaria(123456, "Maria Silva", 1000.0);
 
        System.out.println("=== Dados Iniciais === \n");
        conta.mostrarDados();
       
        System.out.print("\nDigite o valor para deposito: ");
        double valorDeposito = teste.nextDouble();
        conta.depositar(valorDeposito);
        conta.mostrarDados();
        
        System.out.print("\nDigite o valor para saque: ");
        double valorSaque = teste.nextDouble();
        conta.sacar(valorSaque);
        conta.mostrarDados();

        teste.close();
    }
}

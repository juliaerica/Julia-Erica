package juliaericalista.Questao07e08;

import juliaericalista.Questao07e08.Vendedor;
import juliaericalista.Questao07e08.Gerente;
import juliaericalista.Questao07e08.Funcionario;

public class MainFuncionario {
    
    public static void main(String[] args) {
        // Criando objetos
        Gerente gerente = new Gerente("Ana", "123.456.789-00", 5000, 2000);
        Vendedor vendedor = new Vendedor("Carlos", "987.654.321-00", 3000, 1500);
        Funcionario funcionario = new Funcionario("Beatriz", "111.222.333-44", 2500);

        // Exibindo os salários calculados
        System.out.println("Funcionário: " + gerente.nome);
        System.out.println("Salário: R$ " + gerente.calcularSalario());
        System.out.println("-----------------------------");

        System.out.println("Funcionário: " + vendedor.nome);
        System.out.println("Salário: R$ " + vendedor.calcularSalario());
        System.out.println("-----------------------------");

        System.out.println("Funcionário: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.calcularSalario());
        System.out.println("-----------------------------");
    }
}


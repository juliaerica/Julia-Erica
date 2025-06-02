package juliaericalista.Questao07e08;
import juliaericalista.Questao07e08.Vendedor;
import juliaericalista.Questao07e08.Gerente;
import juliaericalista.Questao07e08.Funcionario;
import java.util.ArrayList;

public class FuncionariosArray {

    public static void main(String[] args) {
        // Criando a lista de funcionários (polimórfica)
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários de tipos diferentes
        funcionarios.add(new Gerente("Ana", "12345678900", 5000, 2000));
        funcionarios.add(new Vendedor("Carlos", "98765432100", 3000, 1500));
        funcionarios.add(new Funcionario("Beatriz", "11122233344", 2500));
        funcionarios.add(new Vendedor("João", "55566677788", 2800, 1200));
        funcionarios.add(new Gerente("Marcos", "99988877766", 6000, 2500));

        // Iterando sobre a lista de forma polimórfica
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome);
            System.out.println("CPF: " + f.cpf);
            System.out.println("Salário calculado: R$ " + f.calcularSalario());
            System.out.println("-----------------------------");
        }
    }
}

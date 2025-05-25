package juliaericalista;
import java.util.Scanner;

public class MainPessoaEndereco {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Dados da Pessoa
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        // Dados do Endereco
        System.out.print("Informe a rua: ");
        String rua = scanner.nextLine();

        System.out.print("Informe o número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Informe o CEP: ");
        double cep = scanner.nextDouble();

        // Criar objetos
        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        // Mostrar resultado
        System.out.println("\nDados da pessoa:");
        System.out.println(pessoa);

        scanner.close();
    }
}

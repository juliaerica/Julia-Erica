
package juliaericalista.Questao10;

import juliaericalista.Questao10.Biblioteca;
import juliaericalista.Questao10.Livro;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro(new Livro("Java Básico", "José Silva", "ISBN001"));
        biblioteca.adicionarLivro(new Livro("POO Avançada", "Maria Souza", "ISBN002"));
        biblioteca.adicionarLivro(new Livro("Estruturas de Dados", "Carlos Lima", "ISBN003"));
        biblioteca.adicionarLivro(new Livro("Banco de Dados", "Ana Clara", "ISBN004"));

        // Adicionando usuários
        biblioteca.adicionarUsuario(new UsuarioComum("João", "U001"));
        biblioteca.adicionarUsuario(new UsuarioPremium("Mariana", "U002"));

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Fazendo empréstimos
        biblioteca.emprestarLivro("ISBN001", "U001"); // João
        biblioteca.emprestarLivro("ISBN002", "U001");
        biblioteca.emprestarLivro("ISBN003", "U001");
        biblioteca.emprestarLivro("ISBN004", "U001"); // Deve dar erro (limite)

        biblioteca.emprestarLivro("ISBN004", "U002"); // Mariana (premium, sem limite)

        // Listando livros disponíveis após empréstimos
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo livro
        biblioteca.devolverLivro("ISBN002");

        // Listando livros após devolução
        biblioteca.listarLivrosDisponiveis();
    }
}

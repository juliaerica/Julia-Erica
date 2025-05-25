package juliaericalista;
import java.util.ArrayList;

public class Biblioteca {
  
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário com ID " + usuarioId + " não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro já está emprestado.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário atingiu o limite de empréstimos.");
            return;
        }

        livro.setEmprestado(true);
        usuario.emprestarLivro(livro);
        System.out.println("Livro emprestado com sucesso para " + usuario.getNome() + ".");
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarLivro(isbn);
        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("Livro não está emprestado.");
            return;
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getLivrosEmprestados().contains(livro)) {
                usuario.devolverLivro(livro);
                livro.setEmprestado(false);
                System.out.println("Livro devolvido com sucesso por " + usuario.getNome() + ".");
                return;
            }
        }

        System.out.println("Usuário que emprestou o livro não encontrado.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("---- Livros Disponíveis ----");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro.getTitulo() + " | Autor: " + livro.getAutor() + " | ISBN: " + livro.getIsbn());
            }
        }
        System.out.println("----------------------------");
    }

    private Livro buscarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}


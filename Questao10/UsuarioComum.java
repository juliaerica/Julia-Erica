package juliaericalista.Questao10;

import juliaericalista.Questao10.Usuario;

public class UsuarioComum extends Usuario {
  
    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < 3;
    }
}

package juliaericalista;

public class UsuarioPremium extends Usuario {
    
    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return true; // Sem limite
    }
}

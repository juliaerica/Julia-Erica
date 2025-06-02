package juliaericalista.Questao05;
import java.util.HashSet;
import java.util.Objects;

public class Contato {
    
    String nome;
    String email;
    double telefone;

    public Contato(String nome, String email, double telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
     // Sobrescrevendo o toString()
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
    
    // Sobrescrevendo o equals() para comparar pelo email
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contato)) return false;
        Contato outro = (Contato) obj;
        return Objects.equals(email, outro.email);
    }

    // Sobrescrevendo o hashCode() também baseado no email
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ana", "ana@email.com", 1111-1111);
        Contato c2 = new Contato("Bruno", "bruno@email.com", 2222-2222);
        Contato c3 = new Contato("Carlos", "ana@email.com", 3333-3333); // Mesmo email que Ana

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); // Este não será adicionado, pois tem o mesmo email que Ana

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
    
    
}

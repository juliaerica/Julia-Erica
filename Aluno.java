package juliaericalista;

public class Aluno {

    String nome;
    String matricula;
    String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public Aluno() {
        this.nome = "Campo vazio";
        this.matricula = "Campo vazio";
        this.curso = "Campo vazio\n";
    }
    
    void Alunopadrao(){
        System.out.println("\nAluno:" +nome);
        System.out.println("Matricula:" +matricula);
        System.out.println("Curso:" +curso);
    }
    
    void Alunopreechido(){
        System.out.println("\nAluno:" +nome);
        System.out.println("Matricula:" +matricula);
        System.out.println("Curso:" +curso);
    }
    
    
    
     public static void main(String[] args) {
         Aluno a1 = new Aluno();
         Aluno a2 = new Aluno("Julia","272aa", "info");
         
         System.out.println("Aluno padrão:\n" );
         a1.Alunopadrao();
         System.out.println("Aluno cadastrado:\n" );
         a2.Alunopreechido();
     
     }
    
}

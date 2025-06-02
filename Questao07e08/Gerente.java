
package juliaericalista.Questao07e08;

import juliaericalista.Questao07e08.Funcionario;

public class Gerente extends Funcionario {
    
    double bonus;
    
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

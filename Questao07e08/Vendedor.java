package juliaericalista.Questao07e08;

import juliaericalista.Questao07e08.Funcionario;

public class Vendedor extends Funcionario {
    
    double comissao;
    
    public Vendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
    
}

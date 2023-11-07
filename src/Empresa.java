import java.util.ArrayList;


class Empresa {
   String nome;
   String cnpj;
   String cidade;
   String uf;
   
   ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj, String cidade, String uf) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.uf = uf;
        this.funcionarios = new ArrayList<>();
    }

    public void adiciona(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    
    public boolean contemFuncionario(Funcionario funcionario) {
        return funcionarios.contains(funcionario);
    }

    public void imprimirFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("******");
        }
    }
}


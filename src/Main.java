import java.util.ArrayList;

public class Main {
	
	
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "123.456.789-00", "01/01/1990", "123-456-7890", 3000.0, "Programador", "Rua A, 123");
        
        
        Funcionario funcionario2 = new Funcionario("Maria", "987.654.321-00", "05/05/1985", "987-654-3210", 4000.0, "Gerente", "Rua B, 456");

        Empresa empresa = new Empresa("Minha Empresa", "12345678900001", "Minha Cidade", "UF");
        
        
        empresa.adiciona(funcionario1);
        
        
        empresa.adiciona(funcionario2);

        Funcionario funcionario3 = new Funcionario("Lucas", "111.222.333-44", "10/10/1995", "111-222-3333", 3500.0, "Analista", "Rua C, 789");

    
        if (empresa.contemFuncionario(funcionario3)) {
        	
            System.out.println("O funcionário Lucas faz parte da empresa.");
            
        } else {
        	
            System.out.println("O funcionário Lucas não faz parte da empresa.");
            
            
        }

        empresa.imprimirFuncionarios();
    }
}


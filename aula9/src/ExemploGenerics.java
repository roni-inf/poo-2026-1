import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploGenerics {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Set<String> cores = new HashSet<>();
        Funcionario func = new Funcionario("Rodrigo","Programador", 9000);
        func.abono(100);
        
        funcionarios.add(new Funcionario("Marcelo", "Programador", 9000));
        funcionarios.add(new Funcionario("Mariana", "Programadora", 9000));
        funcionarios.add(func);
        
        funcionarios.get(1).abono(100);
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }
}

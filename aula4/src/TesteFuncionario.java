import javax.swing.JOptionPane;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(123, "Ana", "1245",
                5000, "123456", "ADM", 10);

        Diretor diretor = new Diretor(567, "Maria", "3434", 10000, "Produção");

        gerente.autenticacao("123");
        System.out.println(gerente.imprimirContraCheque());
        System.out.println(gerente.toString());

        gerente.reajusteSalario();
        System.out.println("Salário Atualizado Gerente:" + gerente.getSalario());

        diretor.reajusteSalario();
        System.out.println("Salário Atualizado Diretor:" + diretor.getSalario());

        JOptionPane.showMessageDialog(null, gerente.toString(), "teste",3);
    }
}

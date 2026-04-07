public class ExemploTernario {
    public static void main(String[] args) {
        boolean concluida = true;
        double media = 10;

        if (concluida) {
            System.out.println("Tarefa concluída com sucesso!");
        } else {
            System.out.println("Tarefa não concluída");
        }

        // System.out.println(concluida ? "Tarefa concluída com sucesso!" : "Tarefa não
        // concluída");
        // Média < 5 -Ruim -menor que 9-Bom - maior ou igual a 9 - ótimo

        System.out.println(media < 5 ? "Ruim" : media < 9 ? "Bom" : "Ótimo");
        
    }
}

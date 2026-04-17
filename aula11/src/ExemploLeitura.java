import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeitura {
    public static void main(String[] args) {
        Scanner sc;
        //File arquivo = new File("\\aula\\arquivo.txt");
        try {
             sc = new Scanner(new File("\\aula\\arquivo.txt"),"UTF-8");   
             while (sc.hasNext()) {
                System.out.println(sc.nextLine());
             }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado!");
        }
    }
}

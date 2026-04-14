import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploGenerico2 {
    public static void main(String[] args) {
        List<String> cores = Arrays.asList("azul");
        List<Integer> inteiros = Arrays.asList(20, 30, 40, 60);
        List<Double> decimais = Arrays.asList(22.0, 35.0, 40.0, 90.);

        List<Object> objetos = new ArrayList<>();
        
        copiar(decimais, objetos);
        imprimir(objetos);
    }

    public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
        for (Number numero : origem) {
            destino.add(numero);
        }
    }
    
    public static void imprimir(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}

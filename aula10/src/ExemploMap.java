import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, String> estados = new TreeMap<>();
        
        estados.put("AC", "Acre");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("BA", "Bahia");

        for (String sigla : estados.keySet()) {
          //  System.out.println(sigla);
        }

        System.out.println("*******************");
        for (String valor : estados.values()) {
            //System.out.println(valor);
        }
        System.out.println("*******************");

        for (Map.Entry<String, String> tudo : estados.entrySet()) {
            System.out.println(tudo.getKey() + "-" + tudo.getValue());
        }

    }
}

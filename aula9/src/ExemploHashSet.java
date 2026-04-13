import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set produtos = new TreeSet();
        produtos.add(new String("Celular"));
        produtos.add("Celular");
        produtos.add("TV");
        produtos.add("celular");
        produtos.add("Som");
        

        for (Object o : produtos) {
            System.out.println(o);
        }
    }
}

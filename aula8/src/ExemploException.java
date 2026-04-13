public class ExemploException {
    public static void main(String[] args) {

        try {
            System.out.println("Resultado:" + calcular(10, 5));
            System.out.println("Fim de Programa!");
        } catch (ArithmeticException e) {
            System.err.println("Erro! Divisão por zero!");
        }finally{
            System.out.println("Fim de Programa no finally");
        }
    }

    public static int calcular(int a, int b) {
        return a / b;
    }
}

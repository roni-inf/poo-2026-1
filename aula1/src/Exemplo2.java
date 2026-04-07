public class Exemplo2 {
    public static void main(String[] args) {
        String dia = "Domingo";

        String resultado = switch (dia){
              case "Segunda" -> "dia de semana";
              case "Terça"-> "dia de semana";  
              case "Quarta"-> "dia de semana";  
              case "Quinta"-> "dia de semana";  
              case "Sexta"-> "dia de semana";  
              case "Sábado"-> "fim de semana";  
              case "Domingo"-> "fim de semana";  
            default -> "Dia inválido";

        };
        System.out.println(resultado);

        String time = "Flamengo";
        String resposta = switch(time){
            case "Flamengo", "Vasco", "Botafogo", "Fluminense" -> "Rio Janeiro";
            case "São Paulo", "Palmeiras", "Santos","Corinthias" -> "São Paulo";
            default -> "Outro Estado";
        };
        System.out.println(resposta);
    }
}

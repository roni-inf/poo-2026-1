public class TesteJogador {
    public static void main(String[] args) {
        Time time = new Time("Santos", "Cuca");

        Jogador j1 = new Jogador("Gabi Gol", 32, "Atacante");
        Jogador j2 = new Jogador("Neymar", 34, "Atacante");
        Jogador j3 = new Jogador("Pelé", 32, "Meia");

        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarJogador(j3);

        System.out.println(time.getNome());
        time.listarJogadores();



    }
}

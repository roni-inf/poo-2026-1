// o final na classe serve para que a não possa ter filhos.
public class Servidor {
    protected String cpf;
    protected String nome;
    // Atributo constante
    protected final String lotacao;

    public Servidor(String cpf, String nome, String lotacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.lotacao = lotacao;
    }

    //o método não ser sobrescrito
    public final String imprimirDados() {
        return "Dados dos servidores";
    }

}

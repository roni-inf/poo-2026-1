public class Anestesista extends Medico {
    private String tipoAnestisia;

    public Anestesista(String empresa, String crm, String nome,
            String tipoAnestesia) {
        super(empresa, crm, nome);
        this.tipoAnestisia = tipoAnestesia;
    }

    @Override
    public String toString() {
        return super.toString() + "tipoAnestesia:" + tipoAnestisia;
    }

    public String getTipoAnestesia() {
        return tipoAnestisia;
    }

    @Override
    public double calcularPagamento() {
        return valorPago =  super.calcularPagamento() + 1500;
    }

}

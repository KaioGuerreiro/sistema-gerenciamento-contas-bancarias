package entidade;

public class ContaInvestimento extends ContaBancaria{
    private float taxaJurosInvestimento;
    private float valorInvestido;

    @Override
    public float calcularJuros() {
        return taxaJurosInvestimento * valorInvestido;
    }

    public ContaInvestimento(){
        super();
        nomeTipoConta = "Conta Investimento";
    }

    public ContaInvestimento(float taxaJurosInvestimento, float valorInvestido) {
        super();
        nomeTipoConta = "Conta Investimento";
        this.taxaJurosInvestimento = taxaJurosInvestimento;
        this.valorInvestido = valorInvestido;
    }

    public float getTaxaJurosInvestimento() {
        return taxaJurosInvestimento;
    }

    public void setTaxaJurosInvestimento(float taxaJurosInvestimento) {
        this.taxaJurosInvestimento = taxaJurosInvestimento;
    }

    public float getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }
}

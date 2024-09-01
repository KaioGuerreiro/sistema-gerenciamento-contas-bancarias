package entidade;

public class ContaCorrente extends ContaBancaria{
    private float limiteEspecial;
    private float taxaAdicional;

    @Override
    public float calcularJuros() {
        return limiteEspecial * taxaAdicional;
    }

    public float getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(float limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public float getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(float taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    public ContaCorrente(){

    };
    public ContaCorrente(float limiteEspecial, float taxaAdicional) {
        this.limiteEspecial = limiteEspecial;
        this.taxaAdicional = taxaAdicional;
    }
}

package entidade;

public class ContaBancaria {
    protected float saldo;
    protected float taxa;
    protected String nomeTipoConta;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public String getNomeTipoConta() {
        return nomeTipoConta;
    }

    public ContaBancaria(){
        saldo = 0f;
        taxa = 0f;
    }
    public float calcularJuros(){
        return saldo * taxa;
    }
}

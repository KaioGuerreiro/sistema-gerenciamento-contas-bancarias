package entidade;

public class ContaPoupanca extends ContaBancaria {
     protected float valorMinimo;
     protected String tipoConta;

    @Override
    public float calcularJuros() {
        if(saldo >= valorMinimo){
            return saldo * taxa;
        }
        return 0;
    }
    public ContaPoupanca(){
        super();
        nomeTipoConta = "Conta Poupança";
    }
    public ContaPoupanca(float valorMinimo, String tipoConta) {
        super();
        nomeTipoConta = "Conta Poupança";
        this.valorMinimo = valorMinimo;
        this.tipoConta = tipoConta;
    }

    public float getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(float valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}

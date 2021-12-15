package entity;

public abstract class Conta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected String titular;
    protected double saldo;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.saldo = 0;
        System.out.println("Estou criando uma conta "+ this.numero);
    }


    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //metodos da classe abaixo
    public boolean sacar(double valor){
     if (this.saldo >= valor){
         this.saldo -= valor;
         return true;
     }else {
         return false;
     }
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.sacar(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}

package entity;

public class ContaCorrente extends Conta {


    public ContaCorrente(int agencia, int numero) {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }


}

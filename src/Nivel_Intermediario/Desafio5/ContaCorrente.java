package Nivel_Intermediario.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    public ContaCorrente(String titularDaConta, double saldo, TipoConta tipoConta) {
        super(titularDaConta, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
    saldo += valor;
        System.out.println("Valor de R$ "+String.format("%.2f",valor)+" foi depositado com sucesso!!!");
        consultarSaldo();
    }
}

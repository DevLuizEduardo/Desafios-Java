package Nivel_Intermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    public ContaPoupanca(String titularDaConta, double saldo, TipoConta tipoConta) {
        super(titularDaConta, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor*0.99);
        System.out.println("Apos a taxa de 1%, o valor depositado foi : R$ "+(valor*0.99));
        consultarSaldo();
    }
}

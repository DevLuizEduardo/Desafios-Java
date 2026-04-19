package Nivel_Intermediario.Desafio5;


public class Main {
    public static void main(String[] args) {


        ContaCorrente contaNaruto = new ContaCorrente("Naruto Uzumaki",100,TipoConta.CORRENTE);
        contaNaruto.consultarSaldo();


        ContaPoupanca contaSasuke = new ContaPoupanca("Sasuke Uchiha",100,TipoConta.POUPANCA);
        contaSasuke.consultarSaldo();
        contaSasuke.depositar(50);

        contaSasuke.transferir(contaNaruto,500);
        contaSasuke.transferir(contaNaruto,50,"Aposta com Naruto");

        contaSasuke.consultarSaldo();
        contaNaruto.consultarSaldo();


    }
}

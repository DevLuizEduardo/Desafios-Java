package Nivel_Intermediario.Desafio5;

public interface Conta {
    void consultarSaldo();
    void depositar(double valor);
    void transferir(ContaBancaria destino,double valor);
    void transferir(ContaBancaria destino,double valor,String descricao);
}

package Nivel_Intermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    double saldo;
    TipoConta tipoConta;
    String titularDaConta;


    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
//  Overload/Sobrecarga de Construtores
    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String titularDaConta, double saldo, TipoConta tipoConta) {
       this(saldo,tipoConta);
       this.titularDaConta=titularDaConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("============Conta de "+this.titularDaConta+"===========");
        System.out.println("Tipo de Conta : " + this.tipoConta);
        System.out.println("Seu saldo atual é : R$ "+String.format("%.2f",saldo));

    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        System.out.println("=======Transferencia========");
        if(valor>this.saldo){
            System.out.println("Impossivel Realizar Transferencia, Saldo em Conta Insuficiente!!! ");
        }else{
        this.saldo-=valor;
        destino.saldo+= valor;
            System.out.println("Transferencia de R$ "+String.format("%.2f",valor)+ " Realizada com sucesso!!!");
            System.out.println("Titular da Conta de Origem : "+this.titularDaConta+"\n"+
                               "Titular da Conta de Destino : "+destino.titularDaConta+"\n"+
                                "Tipo da Conta de Destino : "+ destino.tipoConta+"\n"+
                                "Valor Transferido : R$ "+String.format("%.2f",valor));
}
    }

    //Sobrecarga de Metodo
    @Override
    public void transferir(ContaBancaria destino, double valor, String descricao) {
        System.out.println("=======Transferencia========");
        if(valor>this.saldo){
            System.out.println("Impossivel Realizar Transferencia, Saldo em Conta Insuficiente!!! ");
        }else{
            this.saldo-=valor;
            destino.saldo+= valor;
            System.out.println("Transferencia de R$ "+String.format("%.2f",valor)+ " Realizada com sucesso!!!");
            System.out.println("Titular da Conta : "+destino.titularDaConta+"\n"+
                    "Tipo de Conta : "+ destino.tipoConta+"\n"+
                    "Valor Transferido : R$ "+String.format("%.2f",valor)+"\n"+
                    "Descricao : "+descricao);

        }
    }
}

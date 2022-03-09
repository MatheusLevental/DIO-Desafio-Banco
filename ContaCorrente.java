package com.dio.DesafioDioBanco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.ImprimirInfosComuns();

    }


}




package org.example;

import org.example.Cliente.ProcessadorDePagamento;
import org.example.Estrategias.FreteGratis;
import org.example.Estrategias.FretePadrao;
import org.example.Interface.EstrategiaDeFrete;
import org.example.Model.Pedido;

public class Main {
    public static void main(String[] args) {

        ProcessadorDePagamento processador = new ProcessadorDePagamento();

        Pedido pedido = new Pedido(150.0);

        EstrategiaDeFrete freteGratis = new FreteGratis(); // Com frete grátis
        processador.processar(pedido, freteGratis);

        EstrategiaDeFrete fretePadrao = new FretePadrao(30.0); // Com frete padrão
        processador.processar(pedido, fretePadrao);



    }
}
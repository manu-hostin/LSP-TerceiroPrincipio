package org.example.Cliente;

import org.example.Interface.EstrategiaDeFrete;
import org.example.Model.Pedido;

public class ProcessadorDePagamento {
    // deve receber o Pedido e a EstrategiaDeFrete como argumentos

    public void processar (Pedido pedido, EstrategiaDeFrete estrategiaDeFrete) {

        double valorFinal = estrategiaDeFrete.calcularValorFinal(pedido);

        if (pedido.getValorFinal() < pedido.getValorBruto()) {
            throw new IllegalStateException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }
        System.out.println("Pedido processado. Valor final: " + valorFinal);

    }
}

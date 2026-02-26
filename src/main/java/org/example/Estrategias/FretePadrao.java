package org.example.Estrategias;

import org.example.Interface.EstrategiaDeFrete;
import org.example.Model.Pedido;

public class FretePadrao implements EstrategiaDeFrete {
    private double valorFrete;
    public FretePadrao(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularValorFinal(Pedido pedido) {
        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }

        return pedido.getValorBruto() + valorFrete;
    }
}

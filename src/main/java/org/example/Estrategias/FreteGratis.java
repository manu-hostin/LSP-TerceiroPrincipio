package org.example.Estrategias;

import org.example.Interface.EstrategiaDeFrete;
import org.example.Model.Pedido;

public class FreteGratis implements EstrategiaDeFrete {
    // retorna o valor sem alteração no frete

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto();
    }

}

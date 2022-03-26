package imposto.impl;

import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {

    private BigDecimal aliquota = BigDecimal.valueOf(0.05);

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(aliquota);
    }
}

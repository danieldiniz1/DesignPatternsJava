package imposto.impl;

import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements TipoImposto {

    private BigDecimal aliquota = BigDecimal.valueOf(0.10);

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(aliquota);
    }
}

package imposto.impl;

import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends TipoImposto {

    private BigDecimal aliquota = BigDecimal.valueOf(0.10);

    public ICMS(TipoImposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(aliquota);
    }

}

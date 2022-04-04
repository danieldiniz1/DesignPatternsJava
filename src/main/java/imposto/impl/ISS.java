package imposto.impl;

import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends TipoImposto {

    private BigDecimal aliquota = BigDecimal.valueOf(0.05);

    public ISS(TipoImposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(aliquota);
    }


}

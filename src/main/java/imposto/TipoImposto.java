package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    public BigDecimal calcular(Orcamento orcamento);
}

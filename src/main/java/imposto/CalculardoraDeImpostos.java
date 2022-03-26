package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculardoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}

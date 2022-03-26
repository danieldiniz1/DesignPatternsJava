package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculardoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){

        return tipoImposto.calcular(orcamento);

        }
}


package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculardoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){

        switch (tipoImposto){
            case ICMS:
                return orcamento.getValor().multiply(tipoImposto.valorImposto());
            case ISS:
                return orcamento.getValor().multiply(tipoImposto.valorImposto());
            default:
                return BigDecimal.ZERO;
        }
    }
}

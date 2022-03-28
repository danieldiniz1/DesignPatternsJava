package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoValorMaiorQuinhentos extends Desconto{

    public DescontoParaOrcamentoValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500))>0){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        }
        return proximo.calcular(orcamento);
    }
}

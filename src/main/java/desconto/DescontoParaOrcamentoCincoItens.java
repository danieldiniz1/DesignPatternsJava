package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoCincoItens extends Desconto {

    public DescontoParaOrcamentoCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return proximo.calcular(orcamento);
    }
}

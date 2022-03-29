package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoCincoItens extends Desconto {

    public DescontoParaOrcamentoCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}

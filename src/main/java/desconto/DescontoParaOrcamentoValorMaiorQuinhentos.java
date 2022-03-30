package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoValorMaiorQuinhentos extends Desconto{

    public DescontoParaOrcamentoValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(BigDecimal.valueOf(500))>0;

    }
}

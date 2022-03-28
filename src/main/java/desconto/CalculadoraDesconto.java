package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoCincoItens(
                new DescontoParaOrcamentoValorMaiorQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}

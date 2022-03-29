package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoCincoItens(
                new DescontoParaOrcamentoValorMaiorQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}

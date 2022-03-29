package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiraDeDescontos = new DescontoParaOrcamentoCincoItens(
                new DescontoParaOrcamentoValorMaiorQuinhentos(
                        new SemDesconto()));

        return cadeiraDeDescontos.calcular(orcamento);
    }
}

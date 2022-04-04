package teste;

import imposto.CalculardoraDeImpostos;
import imposto.TipoImposto;
import imposto.impl.ICMS;
import imposto.impl.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        ItemOrcamento item = new ItemOrcamento(BigDecimal.valueOf(100));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(item);
        CalculardoraDeImpostos calculardoraDeImpostos = new CalculardoraDeImpostos();

        System.out.println("O Imposto para o orçamento de R$ " + orcamento.getValor() + "" +
                " será de R$ " + calculardoraDeImpostos.calcular(orcamento, new ISS(null)));
    }
}

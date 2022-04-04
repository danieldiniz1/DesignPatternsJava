package teste;

import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao  {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(200)));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(500)));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }

}

package teste;

import imposto.CalculardoraDeImpostos;
import imposto.impl.ICMS;
import imposto.impl.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostoVariosTipos {

    public static void main(String[] args) {
        CalculardoraDeImpostos calculardora = new CalculardoraDeImpostos();
        ItemOrcamento item = new ItemOrcamento(BigDecimal.valueOf(100));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(item);


        System.out.println(calculardora.calcular(orcamento,new ICMS(new ISS(null))));
    }



}

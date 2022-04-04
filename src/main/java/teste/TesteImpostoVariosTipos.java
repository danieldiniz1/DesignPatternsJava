package teste;

import imposto.CalculardoraDeImpostos;
import imposto.impl.ICMS;
import imposto.impl.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostoVariosTipos {

    public static void main(String[] args) {
        CalculardoraDeImpostos calculardora = new CalculardoraDeImpostos();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100),1);


        System.out.println(calculardora.calcular(orcamento,new ICMS(new ISS(null))));
    }



}

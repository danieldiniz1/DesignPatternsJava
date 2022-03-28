package teste;

import desconto.CalculadoraDesconto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(BigDecimal.valueOf(200),6);
        Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(1000),1);
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.println(calculadoraDesconto.calcular(orcamento1));
        System.out.println(calculadoraDesconto.calcular(orcamento2));
    }
}

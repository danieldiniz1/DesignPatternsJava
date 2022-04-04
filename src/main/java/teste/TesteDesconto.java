package teste;

import desconto.CalculadoraDesconto;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(100)));

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(200)));
        orcamento2.adicionarItem(new ItemOrcamento(BigDecimal.valueOf(1000)));

        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.println(calculadoraDesconto.calcular(orcamento1));
        System.out.println(calculadoraDesconto.calcular(orcamento2));
    }
}

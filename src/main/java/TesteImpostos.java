import imposto.CalculardoraDeImpostos;
import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
        CalculardoraDeImpostos impostos = new CalculardoraDeImpostos();
        TipoImposto tipoImposto = TipoImposto.ICMS;
        BigDecimal imposto = impostos.calcular(orcamento, tipoImposto);

        System.out.println("O Imposto para o orçamento de R$ " + orcamento.getValor() + "" +
                " do tipo: " + tipoImposto + " é de R$ " + imposto);
    }
}

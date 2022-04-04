package teste;

import adapter.impl.JavaHttpClient;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.RegistroDeOrçamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        ItemOrcamento item = new ItemOrcamento(BigDecimal.valueOf(100));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(item);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrçamento registro = new RegistroDeOrçamento(new JavaHttpClient());
        registro.registrar(orcamento);

    }
}

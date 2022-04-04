package teste;

import adapter.impl.JavaHttpClient;
import orcamento.Orcamento;
import orcamento.RegistroDeOrçamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100),10);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrçamento registro = new RegistroDeOrçamento(new JavaHttpClient());
        registro.registrar(orcamento);

    }
}

package teste;

import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.LogDePedido;
import pedido.acao.SalvarPedidoNoBD;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestesPedido {

    public static void main(String[] args) {
        // lógica para pegar os dados de qualquer lugar (linha de comando, web, APIRest)
        String cliente = "args[0]";
        BigDecimal valorOrcamento = BigDecimal.valueOf(150);
        Integer qtdeItens = Integer.parseInt("3");


        // Gerador de pedido fica apartado e independe de onde vem os dados
        GeraPedido geradorPedido = new GeraPedido(cliente,valorOrcamento,qtdeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBD(), new EnviarEmailPedido(), new LogDePedido()));
        handler.execute(geradorPedido);
    }
}

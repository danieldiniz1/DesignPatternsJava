package teste;

import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedido {

    public static void main(String[] args) {
        // lógica para pegar os dados de qualquer lugar (linha de comando, web, APIRest)
        String cliente = args[0];
        BigDecimal valorOrcamento = BigDecimal.valueOf(Long.parseLong(args[1]));
        Integer qtdeItens = Integer.parseInt(args[3]);


        // Gerador de pedido fica apartado e independe de onde vem os dados
        GeraPedido geradorPedido = new GeraPedido(cliente,valorOrcamento,qtdeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*injeção de dependencias*/);
        handler.execute(geradorPedido);
    }
}

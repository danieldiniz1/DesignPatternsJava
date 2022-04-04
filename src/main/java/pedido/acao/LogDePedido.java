package pedido.acao;

import pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado na data: " + pedido.getData());
    }
}

package pedido;

import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injeção de dependenicas: repository, service ...

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getNomeCliente(), LocalDateTime.now(),orcamento);
    }
}

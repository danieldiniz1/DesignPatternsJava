package pedido;

import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBD;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        ItemOrcamento item = new ItemOrcamento(dados.getValorOrcamento());
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(item);

        Pedido pedido = new Pedido(dados.getNomeCliente(), LocalDateTime.now(),orcamento);

        acoes.forEach((a -> a.executar(pedido)));
    }
}

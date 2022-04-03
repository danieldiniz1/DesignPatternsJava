package pedido.acao;

import pedido.Pedido;

public class SalvarPedidoNoBD implements AcaoAposGerarPedido{

    //contrutor ou injeção de dependencia via annotation com o service;
    public void executar(Pedido pedido){
        System.out.println("salvar no BD com repository");
    }

}

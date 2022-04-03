package pedido.acao;

import pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    //contrutor ou injeção de dependencia via annotation com o service;
    public void executar(Pedido pedido){
        System.out.println("Enviar email com service");
    }

}

package pedido;

import orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String nomeCliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;

    // injeção de dependencia: PedidoRepository, EmailServer ...
    public GeraPedido(String nomeCliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
        this.nomeCliente = nomeCliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}

package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}

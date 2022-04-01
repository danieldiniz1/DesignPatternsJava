package orcamento;

import orcamento.situacao.Aprovado;
import orcamento.situacao.EmAnalise;
import orcamento.situacao.SituacaoOrçamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private SituacaoOrçamento situacao = new EmAnalise();

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setSituacao(SituacaoOrçamento situacaoOrçamento) {
        this.situacao = situacaoOrçamento;
    }

    public SituacaoOrçamento getSituacao() {
        return situacao;
    }
}

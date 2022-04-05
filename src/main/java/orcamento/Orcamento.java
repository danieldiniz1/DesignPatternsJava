package orcamento;

import orcamento.situacao.Aprovado;
import orcamento.situacao.EmAnalise;
import orcamento.situacao.Finalizado;
import orcamento.situacao.SituacaoOrçamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor = BigDecimal.ZERO;
    private SituacaoOrçamento situacao;
    private List<Orcavel> itens = new ArrayList<>();

    public Orcamento() {
        this.situacao = new EmAnalise();
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this.valor;
    }

    public Integer getQuantidadeItens() {
        return itens.size();
    }

    public void setSituacao(SituacaoOrçamento situacaoOrçamento) {
        this.situacao = situacaoOrçamento;
    }

    public SituacaoOrçamento getSituacao() {
        return situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item){
        this.valor = this.valor.add(item.getValor());
        this.itens.add(item);
    }
}

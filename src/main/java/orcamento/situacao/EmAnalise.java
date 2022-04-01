package orcamento.situacao;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrçamento {

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }

}

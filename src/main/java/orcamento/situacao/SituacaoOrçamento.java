package orcamento.situacao;

import exception.DomainException;
import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrçamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado duas vezes");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento já está reprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw  new DomainException("Orçamento já está finalizado");
    }

}

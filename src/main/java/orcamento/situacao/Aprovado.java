package orcamento.situacao;

import exception.DomainException;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrçamento {


    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}

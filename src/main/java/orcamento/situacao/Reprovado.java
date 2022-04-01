package orcamento.situacao;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrçamento {

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}

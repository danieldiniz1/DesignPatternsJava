package orcamento;

import adapter.Adapter;
import exception.OrcamentoInvalid;

import java.util.Map;

public class RegistroDeOrçamento {

    private Adapter http;


    public RegistroDeOrçamento(Adapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if (!orcamento.isFinalizado()){
            throw new OrcamentoInvalid("O orçamento não está finalizado");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
               "valor", orcamento.getValor(),
               "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url,dados);
    }
}

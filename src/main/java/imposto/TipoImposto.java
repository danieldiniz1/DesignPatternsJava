package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class TipoImposto {

    private TipoImposto outro;


    public TipoImposto(TipoImposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outro != null){
            valorOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);

    }
}

package imposto;

import java.math.BigDecimal;

public enum TipoImposto {

    ICMS(1, "Imposto estadual sobre circulação de mercadorias"){
        @Override
        public BigDecimal valorImposto() {
            return new BigDecimal("0.1");
        }
    };

    private Integer cod;
    private String descricao;

    TipoImposto(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoImposto toEnum(Integer cod){
        if (cod.equals(null)){
            throw new NullPointerException();
        }

        for (TipoImposto tipoImposto : TipoImposto.values()) {
            if (cod.equals(tipoImposto.getCod())){
                return tipoImposto;
            }
        }
        throw new IllegalArgumentException("Não existe o tipo de imposto cadastrado com código: " + cod);
    }

    public abstract BigDecimal valorImposto();
}

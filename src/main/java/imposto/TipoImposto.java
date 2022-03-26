package imposto;

import java.math.BigDecimal;

public enum TipoImposto {

    ICMS{
        @Override
        public BigDecimal valorImposto() {
            return BigDecimal.valueOf(0.1);
        }
    },
    ISS{
        @Override
        public BigDecimal valorImposto() {
            return BigDecimal.valueOf(0.05);
        }
    };

    public abstract BigDecimal valorImposto();
}

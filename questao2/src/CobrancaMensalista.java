package questao2.src;

public class CobrancaMensalista implements Cobranca {
    private static final double VALOR_FIXO = 250.0;
    
    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}

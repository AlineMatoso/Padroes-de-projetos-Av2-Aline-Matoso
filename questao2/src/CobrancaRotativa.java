package questao2.src;

public class CobrancaRotativa implements Cobranca {
    private static final double VALOR_HORA = 10.0;
    
    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (int) Math.ceil(minutos / 60.0);
        return horasIniciadas * VALOR_HORA;
    }
}

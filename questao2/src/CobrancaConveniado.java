package questao2.src;

public class CobrancaConveniado implements Cobranca {
    private static final double VALOR_HORA = 10.0;
    private static final double DESCONTO = 0.20; // 20%
    
    @Override
    public double calcular(int minutos) {
        if (minutos <= 30) {
            return 0.0; // Primeiros 30 min gratuitos
        }
        int minutosCobrados = minutos - 30;
        int horasIniciadas = (int) Math.ceil(minutosCobrados / 60.0);
        double valorBruto = horasIniciadas * VALOR_HORA;
        return valorBruto * (1.0 - DESCONTO);
    }
}

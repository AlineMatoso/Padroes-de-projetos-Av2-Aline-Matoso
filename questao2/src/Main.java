package questao2.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("TARIFA DE ESTACIONAMENTO\n");
        
        int tempoPermanencia = 140; // 2h20min
        // int tempoPermanencia = 120; // 30 min pra ver se a gratuidade da certo
        System.out.println("Tempo de permanência: " + tempoPermanencia + " minutos\n");
        
        // Perfil Rotativo (140 min = 3 horas iniciadas -> 3 * 10 = 30)
        Tiquete t1 = new Tiquete("ABC-1234", tempoPermanencia, new CobrancaRotativa());
        System.out.printf("Valor Rotativo: R$ %.2f\n", t1.calcularValor());
        
        // Trocando o perfil em tempo de execução
        t1.setPerfil(new CobrancaMensalista());
        System.out.printf("Valor Mensalista: R$ %.2f\n", t1.calcularValor());
        
        // Troca de novo
        // 140 min - 30 min gratis = 110 min -> 2 horas iniciadas = 20 * 0.8 (desconto 20%) = 16
        t1.setPerfil(new CobrancaConveniado());
        System.out.printf("Valor Conveniado: R$ %.2f\n", t1.calcularValor());
    }
}

package questao3.src;

public class Calda extends BebidaDecorator {
    public Calda(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public String getDescricao() {
        return bebidaEnvolvida.getDescricao() + ", Calda";
    }
    
    @Override
    public double getPreco() {
        return bebidaEnvolvida.getPreco() + 1.5;
    }
}

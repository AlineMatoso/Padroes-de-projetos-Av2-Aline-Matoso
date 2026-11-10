package questao3.src;

public class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public String getDescricao() {
        return bebidaEnvolvida.getDescricao() + ", Canela";
    }
    
    @Override
    public double getPreco() {
        return bebidaEnvolvida.getPreco() + 0.5;
    }
}

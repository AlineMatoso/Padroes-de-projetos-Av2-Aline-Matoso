package questao3.src;

public class Leite extends BebidaDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public String getDescricao() {
        return bebidaEnvolvida.getDescricao() + ", Leite";
    }
    
    @Override
    public double getPreco() {
        return bebidaEnvolvida.getPreco() + 2.0;
    }
}

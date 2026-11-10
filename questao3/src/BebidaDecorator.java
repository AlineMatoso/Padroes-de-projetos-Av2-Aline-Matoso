package questao3.src;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaEnvolvida;
    
    public BebidaDecorator(Bebida bebida) {
        this.bebidaEnvolvida = bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebidaEnvolvida.getDescricao();
    }
    
    @Override
    public double getPreco() {
        return bebidaEnvolvida.getPreco();
    }
}

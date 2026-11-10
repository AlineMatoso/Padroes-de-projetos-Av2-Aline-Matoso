package questao3.src;

public class Chantilly extends BebidaDecorator {
    public Chantilly(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public String getDescricao() {
        return bebidaEnvolvida.getDescricao() + ", Chantilly";
    }
    
    @Override
    public double getPreco() {
        return bebidaEnvolvida.getPreco() + 3.5;
    }
}

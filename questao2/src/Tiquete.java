package questao2.src;

public class Tiquete {
    private String placa;
    private int minutosPermanencia;
    private Cobranca perfil; 
    
    public Tiquete(String placa, int minutosPermanencia, Cobranca perfilInicial) {
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.perfil = perfilInicial;
    }
    
    public void setPerfil(Cobranca novoPerfil) {
        this.perfil = novoPerfil;
    }
    
    public double calcularValor() {
        if (perfil == null) throw new IllegalStateException("Perfil de cobrança não definido.");
        return perfil.calcular(minutosPermanencia);
    }
    
    public String getPlaca() { return placa; }
    public int getMinutosPermanencia() { return minutosPermanencia; }
}

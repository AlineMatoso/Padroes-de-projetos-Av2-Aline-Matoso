package questao1.src;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {
    private String nome;
    private int quantidadeEstoque;
    private List<Observer> observers = new ArrayList<>();
    
    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeInicial;
    }
    
    public String getNome() { return nome; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    
    public void setQuantidadeEstoque(int novaQuantidade) {
        // RQ1.4: Comunicação só ocorre se mudar
        if (this.quantidadeEstoque != novaQuantidade) {
            this.quantidadeEstoque = novaQuantidade;
            notificarObservers(); // RQ1.3
        }
    }
    
    @Override
    public void adicionarObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }
    
    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }
    
    @Override
    public void notificarObservers() {
        for (Observer o : observers) {
            o.atualizar(this);
        }
    }
}

package questao1.src;

public interface Subject {
    void adicionarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers();
}

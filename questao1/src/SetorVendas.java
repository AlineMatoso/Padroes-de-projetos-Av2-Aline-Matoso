package questao1.src;

public class SetorVendas implements Observer {
    private int estoqueAnterior = -1; // -1 indica estado inicial desconhecido
    
    @Override
    public void atualizar(Produto produto) {
        int estoqueAtual = produto.getQuantidadeEstoque();
        if (estoqueAnterior == 0 && estoqueAtual > 0) {
            System.out.println("[VENDAS] ALERTA: O produto " + produto.getNome() + " voltou ao estoque! Quantidade: " + estoqueAtual);
        }
        estoqueAnterior = estoqueAtual;
    }
}

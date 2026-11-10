package questao1.src;

public class SetorCompras implements Observer {
    @Override
    public void atualizar(Produto produto) {
        if (produto.getQuantidadeEstoque() < 5) {
            System.out.println("[COMPRAS] ALERTA: O estoque de " + produto.getNome() + " está baixo (" + produto.getQuantidadeEstoque() + " unidades).");
        }
    }
}

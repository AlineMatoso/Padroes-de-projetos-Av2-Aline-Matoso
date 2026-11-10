package questao1.src;

public class SetorAuditoria implements Observer {
    @Override
    public void atualizar(Produto produto) {
        System.out.println("[AUDITORIA] LOG: Produto " + produto.getNome() + " teve seu estoque alterado para " + produto.getQuantidadeEstoque() + " unidades.");
    }
}

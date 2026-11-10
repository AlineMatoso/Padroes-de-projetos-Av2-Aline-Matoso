package questao1.src;

public class MainObserver {
    public static void main(String[] args) {
        System.out.println("MONITOR DE ESTOQUE\n");
        
        Produto notebook = new Produto("Notebook", 10);
        
        Observer compras = new SetorCompras();
        Observer vendas = new SetorVendas();
        Observer auditoria = new SetorAuditoria();
        
        notebook.adicionarObserver(compras);
        notebook.adicionarObserver(vendas);
        notebook.adicionarObserver(auditoria);
        
        // Simulação de produtos sendo vendidos e estoque sendo alterado
        System.out.println("Alterando para 4 (teste Compras e Auditoria)");
        notebook.setQuantidadeEstoque(4);
        
        System.out.println("\nAlterando para 4 novamente (NÃO dispara notificação)");
        notebook.setQuantidadeEstoque(4);
        
        System.out.println("\nAlterando para 0 (teste Compras e Auditoria)");
        notebook.setQuantidadeEstoque(0);
        
        System.out.println("\nAlterando para 2 (dispara Vendas, Compras e Auditoria)");
        notebook.setQuantidadeEstoque(2);
        
        System.out.println("\nRemovendo o setor de Auditoria e alterando estoque para 1...");
        notebook.removerObserver(auditoria);
        notebook.setQuantidadeEstoque(1); 
    }
}

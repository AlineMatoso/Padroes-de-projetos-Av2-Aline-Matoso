package questao3.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("PEDIDOS DE CAFÉ\n");
        
        // Pedido 1: Espresso Simples
        Bebida pedido1 = new Espresso();
        System.out.printf("Pedido 1: %s | R$ %.2f\n", pedido1.getDescricao(), pedido1.getPreco());
        
        // Pedido 2: Chá com Leite e Chantilly
        Bebida pedido2 = new Chantilly(new Leite(new Cha()));
        System.out.printf("Pedido 2: %s | R$ %.2f\n", pedido2.getDescricao(), pedido2.getPreco());
        
        // Pedido 3: Espresso com 2 doses de Leite e Calda (Complemento repetido)
        Bebida pedido3 = new Calda(new Leite(new Leite(new Espresso())));
        System.out.printf("Pedido 3: %s | R$ %.2f\n", pedido3.getDescricao(), pedido3.getPreco());
        
        // Pedido 4: Chá com Leite 
        Bebida pedido4 = new Leite(new Cha());
        System.out.printf("Pedido 4: %s | R$ %.2f\n", pedido4.getDescricao(), pedido4.getPreco());

        // Pedido 5: Chá com Leite e Calda
        Bebida pedido5 = new Calda(new Leite(new Cha()));
        System.out.printf("Pedido 5: %s | R$ %.2f\n", pedido5.getDescricao(), pedido5.getPreco());

        // Pedido 6: Espresso com chantilly
        Bebida pedido6 = new Chantilly(new Espresso());
        System.out.printf("Pedido 6: %s | R$ %.2f\n", pedido6.getDescricao(), pedido6.getPreco());

        // Pedido 7: Chá com chantilly e calda
        Bebida pedido7 = new Chantilly(new Calda(new Cha()));
        System.out.printf("Pedido 7: %s | R$ %.2f\n", pedido7.getDescricao(), pedido7.getPreco());

        // Pedido 8: Chá com canela
        Bebida pedido8 = new Canela(new Cha());
        System.out.printf("Pedido 8: %s | R$ %.2f\n", pedido8.getDescricao(), pedido8.getPreco());

        // Pedido 9: Espresso com canela e chantilly
        Bebida pedido9 = new Chantilly(new Canela(new Espresso()));
        System.out.printf("Pedido 9: %s | R$ %.2f\n", pedido9.getDescricao(), pedido9.getPreco());

        // Pedido 10: Espresso com duas doses de canela
        Bebida pedido10 = new Canela(new Canela(new Espresso()));
        System.out.printf("Pedido 10: %s | R$ %.2f\n", pedido10.getDescricao(), pedido10.getPreco());

        // Pedido 11: Espresso com canela
        Bebida pedido11 = new Canela(new Espresso());
        System.out.printf("Pedido 10: %s | R$ %.2f\n", pedido11.getDescricao(), pedido11.getPreco());


    }
}

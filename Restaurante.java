public class Restaurante {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda("Mesa 8");

        ItemCardapio item1 = new PratoPrincipal("Parmegiana", 25.00);

        ItemCardapio item2 = new Bebida("Vinho", 12.00);

        try {
            comanda1.adicionarItem(item1);
            comanda1.adicionarItem(item2);
        } catch (ItemIndisponivelException ex) {
            System.out.println("Erro de item indisponivel");
        }

        for(ItemCardapio item : comanda1.getItens()) {
            System.out.println(item.exibirItem());
        }

        System.out.println("Total : R$" + comanda1.getFatura().getValorTotal());

        try {
            comanda1.getFatura().adicionarValor(-10);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro unchecked: " + e.getMessage());
        }

        comanda1.cancelar();
        System.out.println("Comanda cancelada? " + comanda1.isCancelada());
    }
}

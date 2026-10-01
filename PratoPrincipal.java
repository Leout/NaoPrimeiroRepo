public class PratoPrincipal extends ItemCardapio{



    public PratoPrincipal(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.1;
    }

}

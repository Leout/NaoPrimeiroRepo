public class Bebida extends ItemCardapio{

    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco();
    }

}

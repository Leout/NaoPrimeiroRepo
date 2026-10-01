import java.util.ArrayList;
import java.util.List;

public class Comanda implements Cancelavel{
    
    private int limiteItem = 10;
    private String mesa;
    private List<ItemCardapio> itens = new ArrayList<>();
    private Fatura fatura;
    private boolean cancelada;

    public int getLimiteItem() {
        return limiteItem;
    }

    public void setLimiteItem(int limiteItem) {
        this.limiteItem = limiteItem;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    public void setItens(List<ItemCardapio> itens) {
        this.itens = itens;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public Comanda(String mesa) {
        this.mesa = mesa;

        this.fatura = new Fatura();
    }

    public void adicionarItem(ItemCardapio itemCardapio) throws ItemIndisponivelException {
        if (itens.size() > limiteItem) {
            throw new ItemIndisponivelException("O limite de itens foi atingido");
        }

        itens.add(itemCardapio);
        fatura.adicionarValor(itemCardapio.calcularPrecoFinal());
    }

    @Override
    public void cancelar() {
        this.cancelada = true;
    }
}

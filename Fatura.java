public class Fatura {
    
    private double valorTotal = 0;

    public double getValorTotal() {
        return valorTotal;
    }

    public void adicionarValor(double valor){
        if (valor < 0){
            throw new ValorInvalidoException("Valor inválido na fatura");
        }
        
        this.valorTotal += valor;
    } 
}

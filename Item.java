public class Item {
    private float valorUnitario; 
    private int quantidade;
    private Produto produto;

    public float total() {
        return this.valorUnitario * this.quantidade;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}

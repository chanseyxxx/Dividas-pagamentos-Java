    //item da compra
    public class Item {
    private float valorUnitario; 
    private int quantidade;
    private Produto produto;

        public float total() {
        return this.valorUnitario * this.quantidade;
        }

    }



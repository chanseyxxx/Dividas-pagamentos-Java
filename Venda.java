public class Venda {
    private String data;
    private BlockObject listItem;
    private Pagamento pagamento;

    //Adicionar items a venda
    public void addItem(Item item) {
        BlockObject b =new BlockObject();
        b.setContent(item);
        add(b);
    }
    
    public void add(BlockObject b){
        if (listItem == null) {
                listItem = b;
            } else {
                BlockObject aux = listItem;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(b);
            }
    }

    //calcular valor total
    public float valorTotal(){
        float sum = 0;
        for(int i = 0; i < this.listItem.tamanho(listItem); i++) {
          Item item = this.listItem.getPosicao(i,listItem);
          sum+= item.total();
        }
        return sum;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String getData(){
        return this.data;
    }
}

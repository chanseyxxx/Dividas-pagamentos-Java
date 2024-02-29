public class Venda {
    private int id;
    private String data;
    private BlockObject listItem;
    private Pagamento pagamento;
    private Cliente cliente;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public static void main(String[] args) {
            // Criando alguns produtos para teste
            Produto produto1 = new Produto();
            produto1.setTipo("Calça");
            
            Produto produto2 = new Produto();
            produto2.setTipo("Camisa");
            
            // Criando alguns itens
            Item item1 = new Item();
            item1.setProduto(produto1);
            item1.setQuantidade(2);
            item1.setValorUnitario(50.0f);
            
            Item item2 = new Item();
            item2.setProduto(produto2);
            item2.setQuantidade(1);
            item2.setValorUnitario(30.0f);
            
            // Criando uma venda
            Venda venda = new Venda();
            venda.setData("2024-02-29");
            venda.addItem(item1);
            venda.addItem(item2);
            
            // Exibindo a data da venda e o valor total
            System.out.println("Data da venda: " + venda.getData());
            System.out.println("Valor total da venda: R$" + venda.valorTotal());
        }
    }
    





//oioi
public class BlockObject {
    private Object content;
    private BlockObject prox;  

    public void setContent(Object content){
        this.content = content;
    }

    public int tamanho(BlockObject b){
        int i = 0;
        BlockObject aux = b;
        while (aux != null){
            i++;
            aux = aux.getProx();
        }
        return i;
    }

    public Item getPosicao(int posicao,BlockObject b){
        int i = 0;
        BlockObject aux = b;
        while (aux != null){
            if(i == posicao){
                return (Item) aux.getContent(); 
            }
            aux = aux.getProx();
            i++;
        }
        return null;
    }
    public Object getContent(){
        return this.content;
    }
    public void setProx(BlockObject prox){
        this.prox = prox;
    }

    public BlockObject getProx(){
        return this.prox;
    }
}

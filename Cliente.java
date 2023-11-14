public class Cliente {
    private String nome; // nome do cliente
    private Pagamento p;//pagamento feito pelo cliente
    
    public Cliente(String nome, Venda v) {
        this.nome = nome;
        this.v = v;
    }

    public float divida(){
        return v.valorTotal() - p.getValor();
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}

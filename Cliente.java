public class Cliente {
    private String nome;// nome do cliente
    private float divida;//Para guardar quanto o cliente deve 
    private Pagamento p;
    private Venda v;
    
    public Cliente(String nome, Venda v) {
        this.nome = nome;
        this.v = v;
    }

    public float calcularDivida(){//calcula divida apartir da compra e do quanto foi pago 
        return v.valorTotal() - p.getValor();
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDivida(float divida){
        this.divida = divida;
    }
    
    public String getNome(){
        return this.nome;
    }
}

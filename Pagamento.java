public class Pagamento {
    private String data;// data que foi ou que vai ser pago
    private float valor;// Quanto foi pago
    private boolean avista;

    public void setData(String data){
        this.data = data;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setAvista(boolean avista){
        this.avista = avista;
    }
    
    public boolean getAvista(){
        return this.avista;
    }
}

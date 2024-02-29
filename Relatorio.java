import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Relatorio {
    private List<Venda> vendas;
    private String titulo;
    private String conteudo;
    private Date dataCriacao;

    // Construtor
    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = new Date(); // Define a data de criação como a data atual
        this.vendas = new ArrayList<>();
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    public List<Venda> getVendas() {
        return vendas;
    }

    public void adicionarVenda(Venda venda) {
        this.vendas.add(venda);
    }

    // Método para imprimir o relatório
    public void imprimirRelatorio() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Data de Criação: " + dataCriacao);
        if (!vendas.isEmpty()) {
            System.out.println("Relatório associado às seguintes vendas:");
            for (Venda venda : vendas) {
                System.out.println("- Venda ID: " + venda.getId());
            }
        }
    }
}

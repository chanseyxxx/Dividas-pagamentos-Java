
import java.util.Date;

public class Relatorio {
    private String titulo;
    private String conteudo;
    private Date dataCriacao;

    // Construtor
    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = new Date(); // Define a data de criação como a data atual
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

    // Método para imprimir o relatório
    public void imprimirRelatorio() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Data de Criação: " + dataCriacao);
    }
}



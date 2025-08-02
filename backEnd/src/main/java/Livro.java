import java.util.Date;

public class Livro {

    private Long id;
    private String titulo;
    private boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizacao;

    public Livro(Long id, String titulo, boolean disponivel, Date dataCadastro,Date dataAtualizacao){
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Long getId(){
        return id;
    }
    public String titulo(){
        return titulo;
    }
    public boolean disponivel(){
        return disponivel;
    }
    public Date dataCadastro(){
        return dataCadastro;
    }
    public Date dataAtualizacao(){
        return dataAtualizacao;
    }
}

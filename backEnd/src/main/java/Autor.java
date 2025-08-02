import java.util.Date;

public class Autor {

    private Long id;
    private String nome;
    private Date dataNascimento;

    public Autor(Long id, String nome, String email, Date dataNascimento){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
}

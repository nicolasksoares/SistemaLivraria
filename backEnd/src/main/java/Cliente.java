import java.util.Date;

public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;

    public Cliente(Long id, String nome, String email, Date dataNascimento){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
}

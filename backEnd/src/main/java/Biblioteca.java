import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Emprestimo> emprestimos;
    private List<Cliente> clientes;

    public Biblioteca(List<Livro> livros, List<Autor> autores, List<Emprestimo> emprestimos){
        this.livros = livros;
        this.autores = autores;
        this.emprestimos = emprestimos;
    }
}

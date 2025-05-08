import java.util.List;

public class TesteAdapter {
    public static void main(String[] args) {
        RepositorioDePessoas repositorio = new PessoaCsvAdapter("pessoas.csv");
        List<Pessoa> pessoas = repositorio.listarPessoas();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
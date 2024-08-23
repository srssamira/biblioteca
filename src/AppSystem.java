import java.util.ArrayList;

public class AppSystem {

    private IO io;
    private Biblioteca biblioteca;

    public AppSystem(IO io) {
        io = new IO();
    }

    public AppSystem() {
        this.biblioteca = new Biblioteca(new ArrayList<>());
    }

    public void run(){
        boolean play = true;

        while(play) {
            int option = io.menu();
            if (option == 1) criarItemBibliografico();
            else if (option == 2) biblioteca.listarItens();
            else if (option == 3) procurarItem();
            else if (option == 4) play = false;
            else if (option > 4) System.out.println("Opção inválida.");
        }
    }

    public void criarItemBibliografico() {
        ItemBibliografico livro = null;

        String codigo = io.input("Digite um codigo: ").nextLine();
        String titulo = io.input("Digite um titulo: ").nextLine();
        int anoPublicacao = io.input("Digite um ano: ").nextInt();
        String autor = io.input("Digite um autor: ").nextLine();
        String isbn = io.input("Digite um isbn: ").nextLine();

        int volume = io.input("Digite um volume: ").nextInt();
        String periodicidade = io.input("Digite uma periodicidade: ").nextLine();

        int opcao = io.input("DIGITE 1 PARA CRIAR UM OBJETO LIVRO OU 2 PARA CRIAR UM OBJETO PERIODICO: ").nextInt();

        if (opcao == 1) {
            livro = new Livro(codigo, titulo, anoPublicacao, autor, isbn);
        } else if (opcao == 2) {
            livro = new Periodico(codigo, titulo, anoPublicacao, volume, periodicidade);
        }
        biblioteca.adicionarItem(livro);
    }

    private void procurarItem(){
        String codigo = io.input("Digite um codigo de busca: ").nextLine();
        biblioteca.buscarPorCodigo(codigo);
    }

    @Override
    public String toString() {
        return "AppSystem{" +
                "io=" + io +
                ", itens=" + biblioteca +
                '}';
    }
}

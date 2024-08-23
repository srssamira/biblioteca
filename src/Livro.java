public class Livro extends ItemBibliografico {
    String autor;
    String isbn;

    public Livro (String codigo, String titulo, String anoPublicacao, String autor, String isbn){
        super(codigo, titulo, anoPublicacao);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean validarCampos(){
        if (autor == null){
            throw new RuntimeException("Autor não pode estar vazio");
        }

        if (isbn.length() != 10 || isbn.length() != 13){
            throw new RuntimeException("ISBN deve ter ou 10 ou 13 caracteres");
        }
        return true;
    }
}

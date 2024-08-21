import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class ItemBibliografico {
    private String codigo;
    private String titulo;
    private int anoPublicacao;

    @Override
    public String toString() {
        return "ItemBibliografico {" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    public ItemBibliografico(String codigo, String titulo, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean validarCampos(){
        Calendar calendario = GregorianCalendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);

        if (codigo == null || titulo == null) {
            throw new RuntimeException("Códigos e títulos não podem possuir valores nulos");
        }

        if (anoPublicacao < 1000 && anoPublicacao > anoAtual) {
            throw new RuntimeException("Ano de publicação inválido");
        }
        return true;
    }
}

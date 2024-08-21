import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<ItemBibliografico> itens;
    Livro livro;
    Periodico periodico;

    public Biblioteca(List<ItemBibliografico> itens) {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBibliografico item) {
        if (livro.validarCampos() && periodico.validarCampos()) {
            itens.add(livro);
            itens.add(periodico);
        }
    }

    public void listarItens() {
        System.out.println(itens);
    }

    public String buscarPorCodigo(String codigo) {
        for (codigo : livro.getCodigo()) {
            if (codigo.equalsIgnoreCase(livro.getCodigo())) {
                return codigo;
            }
        }
        return "Esse livro não existe";
    }
}
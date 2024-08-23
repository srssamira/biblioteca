import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<ItemBibliografico> itens;
    Livro livro;
    Periodico periodico;

    public Biblioteca(List<ItemBibliografico> itens) {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(List<ItemBibliografico> itens) {
        if (livro.validarCampos() && periodico.validarCampos()) {
            itens.add(livro);
            itens.add(periodico);
        }
    }

    public void listarItens() {
        System.out.println(itens);
    }

    public ItemBibliografico buscarPorCodigo(String codigo) {

        try {
            for (int index = 0; index < itens.size(); index++) {
                if (itens.get(index).getCodigo().equalsIgnoreCase(codigo)) {
                    return itens.get(index);
                }
            }
        } catch (Exception e) {
            System.out.println("Esse item não existe.");
        }
        return null;
    }

}

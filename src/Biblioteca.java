import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<ItemBibliografico> itens;
    IO io;

    public Biblioteca(List<ItemBibliografico> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemBibliografico item) {
        try {
            if (item.validarCampos()) {
                itens.add(item);
            }
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar o item.");
        }
    }

    public void listarItens() {
        System.out.println(itens);
    }

    public ItemBibliografico buscarPorCodigo(String codigo) {
        try {
            for (int index = 0; index < itens.size(); index++) {
                if (itens.get(index).getCodigo().equalsIgnoreCase(codigo)) {
                    System.out.println(itens.get(index));
                    return itens.get(index);
                }
            }
        } catch (Exception e) {
            System.out.println("Item inexistente.");
        }
        return null;
    }

}

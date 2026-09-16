package pratica2;

import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;
    private double totalCompra;

    public Fatura() {

    }

    public Fatura(ArrayList<Item> itens) {
        this.itens = new ArrayList<Item>();
        this.totalCompra = 0;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public double acharTotal() {
        for(int i = 0; i < itens.size(); i++) {
            totalCompra += itens.get(i).getTotalItem();
        }
        return totalCompra;
    }

    public void adicionarItem(Produto produto, int qtde) {
        Item item = new Item(qtde, produto);
        itens.add(item); 
    }
}


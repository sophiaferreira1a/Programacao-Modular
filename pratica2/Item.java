package pratica2;

public class Item {
    private int qtde;
    private Produto produto;
    private double totalItem;

    

    public Item() {

    }

    public Item(int qtde, Produto produto) {
        this.qtde = qtde;
        this.produto = produto;
        this.totalItem = produto.getPreco() * qtde;

    }

    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void comprar() {
        this.totalItem = produto.getPreco() * qtde;
    }


}

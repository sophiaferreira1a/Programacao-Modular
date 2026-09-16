package pratica2;

import java.util.Scanner;

public class CarrinhoCompras {
    private static Scanner scan = new Scanner(System.in);
        
    public static void main(String args[]) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        Produto prod1 = new Produto();
        prod1.setCodigo("40028922");
        prod1.setNome("Bola");
        prod1.setPreco(4.99);

        Produto prod2 = new Produto();
        prod2.setCodigo("40038933");
        prod2.setNome("Peteca");
        prod2.setPreco(5.75);

        Produto prod3 = new Produto();
        prod3.setCodigo("40048944");
        prod3.setNome("Estilingue");
        prod3.setPreco(2.8);

        int resp;
        while(true) {
        resp = menu();
        switch(resp) {
            case 1:
                System.out.println("Item: " + prod1.getNome() + "\n" + "Código: " + prod1.getCodigo() + "\n" + "Preço: " +  prod1.getPreco() + "\n" +
                "Item: " + prod2.getNome() + "\n" + "Código: " + prod2.getCodigo() + "\n" + "Preço: " +  prod2.getPreco() + "\n" +
                "Item: " + prod3.getNome() + "\n" + "Código: " + prod3.getCodigo() + "\n" + "Preço: " +  prod3.getPreco() + "\n"  );
                System.out.println("Informe o código do produto. Digite 'voltar' para voltar ao menu principal");
                if(scan.nextLine().equalsIgnoreCase("voltar")) {
                    break;
                } else {
                    Item.setscan.nextLine();
                    System.out.println("Informe a quantidade a ser comprada: ");
                    int qt = scan.nextInt();


                }
            
        }    
        }
        
    }

    public static int menu() {
        System.out.println("1. Comprar\n" + "2.Ver fatura\n" + "3.Excluir item\n" + "4.Alterar item\n" + "5.Finalizar\n");
        return scan.nextInt();  
    }


    
}

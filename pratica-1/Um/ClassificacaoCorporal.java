package Um;
import java.util.Scanner;

public class ClassificacaoCorporal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.println("Idade: ");
        int idade = scan.nextInt();

        System.out.println("Altura: ");
        double altura = scan.nextDouble();

        System.out.println("Peso: ");
        double peso = scan.nextDouble();
        scan.close();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        double IMC = pessoa.calcularIMC();
        System.out.println("IMC: " + IMC);
        System.out.println(pessoa.InformaObesidade(IMC));
        
    }
}

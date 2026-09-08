package Dois;

import java.util.Scanner;

public class ChapeuSeletor {

    private static Scanner scan = new Scanner(System.in);

    public static int menu() {
        System.out.println("1. Cadastrar aluno.\n" +
                "2. Listar todos os alunos.\n" +
                "3. Exibir alunos de uma determinada casa escolhida pelo usuário. Exiba também o total de alunos da casa.\n"
                +
                "4. Exibir alunos por casa.\n" +
                "5. Exibir alunos maiores de idade.\n" +
                "6. Exibir alunos menores de idade\n" +
                "7. Buscar alunos com determinado sobrenome informado pelo usuário. Se o sobrenome for composto, o usuário pode informar apenas 1 e o sistema deve encontrá-lo mesmo assim.\n"
                +
                "8. Encerrar.");
        return scan.nextInt();
    }

    public static Aluno cadastrarAluno() {
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        aluno.setNome(scan.nextLine());

        System.out.println("Data de nascimento (dd/MM/yyyy): ");
        aluno.setDataNascimento(scan.nextLine());

        System.out.println("Coragem: ");
        aluno.setCoragem(scan.nextDouble());

        System.out.println("Inteligência: ");
        aluno.setInteligencia(scan.nextDouble());

        System.out.println("Ambição: ");
        aluno.setAmbicao(scan.nextDouble());

        System.out.println("Lealdade: ");
        aluno.setLealdade(scan.nextDouble());

        System.out.println("Estratégia: ");
        aluno.setEstrategia(scan.nextDouble());

        System.out.println("Criatividade: ");
        aluno.setCriatividade(scan.nextDouble());

        return aluno;
    }

    public static void main(String args[]) {

        int resp;
        Aluno[] alunos = new Aluno[10];
        int indice = 0;

        while (true) {
            resp = menu();

            switch (resp) {
                case 1:
                    indice++;
                    alunos[indice] = cadastrarAluno();
                    alunos[indice].calcularCasa();
                    alunos[indice].exibirInformacoes();
                    scan.nextLine();
                case 2:
                    for(int i = 0; i<=indice; i++) {
                      System.out.println(alunos[i].nomeCompleto());  
                    }
                case 3:
                    System.out.println("Selecione a casa: ");
                    String casa = scan.nextLine().toUpperCase();

                    int totalAlunos=0;

                    for(int i = 0; i<= indice; i++) {
                        String casaAluno = alunos[i].getCasa();
                        if(casaAluno.equals(casa)) {
                            System.out.println(alunos[i].nomeCompleto());
                            totalAlunos++;
                        }
                    }

                    System.out.println(totalAlunos);
                
                case 4:
                    int qtde = 0; 
                    
                    for(int i = 0; i<= indice; i++) {
                        if(alunos[i].getCasa().equals("GRIFINÓRIA")) {
                            System.out.println(alunos[i].nomeCompleto());
                            qtde++;
                        }
                    }
                    System.out.println("Existem " + qtde + " alunos na grifinória");

                    
            } 
        

            System.out.println("Você tem" + indice + "alunos cadastrados.");

        }
    }
}

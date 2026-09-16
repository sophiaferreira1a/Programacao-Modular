package Dois;

import java.util.Scanner;

public class ChapeuSeletor {

    private static Scanner scan = new Scanner(System.in);

    public static int menu() {
        System.out.println("\n1. Cadastrar aluno.\n" +
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

        scan.nextLine();

        System.out.println("Nome: ");
        aluno.setNome(scan.nextLine());

        System.out.println("Sobrenome: ");
        aluno.setSobrenome(scan.nextLine());

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

        int resp=0;
        Aluno[] alunos = new Aluno[10];
        int indice = 0;

        while (resp != 8) {
            resp = menu();

            switch (resp) {
                case 1:
                    alunos[indice] = cadastrarAluno();
                    alunos[indice].calcularCasa();
                    alunos[indice].exibirInformacoes();
                    indice++;
                    scan.nextLine();
                    break;
                case 2:
                    scan.nextLine();
                    for(int i = 0; i<indice; i++) {
                      System.out.println(alunos[i].nomeCompleto());  
                    }
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Selecione a casa: ");
                    String casa = scan.nextLine().toUpperCase();

                    int totalAlunos=0;

                    for(int i = 0; i < indice; i++) {
                        System.out.println(indice);
                        String casaAluno = alunos[i].getCasa();
                        if(casaAluno.equals(casa)) {
                            System.out.println(alunos[i].nomeCompleto());
                            totalAlunos++;
                        }
                    }

                    System.out.println(totalAlunos);

                    break;
                
                case 4:
                    scan.nextLine();
                    int qtde = 0; 
                    if (alunos.length == 0) {
                        System.out.println("Você não tem alunos cadastrados.");
                    }else {
                        for(int i = 0; i< indice; i++) {
                            if(alunos[i].getCasa().equals("GRIFINÓRIA")) {
                                System.out.println(alunos[i].nomeCompleto());
                                qtde++;
                            }
                        }
                        System.out.println("\nExistem  " + qtde + " alunos na grifinória");
    
                        qtde = 0;
                        for(int i = 0; i< indice; i++) {
                            if(alunos[i].getCasa().equals("SONSERINA")) {
                                System.out.println(alunos[i].nomeCompleto());
                                qtde++;
                            }
                        }
                        System.out.println("\nExistem " + qtde + " alunos na sonserina");

                        qtde = 0;
                        for(int i = 0; i< indice; i++) {
                            if(alunos[i].getCasa().equals("CORVINAL")) {
                                System.out.println(alunos[i].nomeCompleto());
                                qtde++;
                            }
                        }
                        System.out.println("\nExistem " + qtde + " alunos na corvinal");

                        qtde = 0;
                        for(int i = 0; i< indice; i++) {
                            if(alunos[i].getCasa().equals("LUFA-LUFA")) {
                                System.out.println(alunos[i].nomeCompleto());
                                qtde++;
                            }
                        }
                        System.out.println("\nExistem " + qtde + " alunos na lufa-lufa");
                        
                        break;
                    }
                case 5:
                    for(int i=0; i < indice;  i++) {
                        if(alunos[i].getIdade() >= 17) {
                            System.out.println(alunos[i].nomeCompleto());
                        }
                    }
                    break;
                case 6:
                    for(int i=0; i < indice;  i++) {
                        if(alunos[i].getIdade() < 17) {
                            System.out.println(alunos[i].nomeCompleto());
                        }
                    }
                    break;
                case 7:
                    if(indice == 0) {
                        System.out.println("Não há alunos a serem buscados");
                        break;
                    }

                    scan.nextLine();
                    System.out.println("Insira o sobrenome a ser buscado: ");
                    String sobrenome = scan.nextLine();


                    for(int i=0; i < indice; i++) {
                        if(alunos[i].verificarPalara(sobrenome)) {
                            System.out.println(alunos[i].nomeCompleto());
                        } else {

                        }
                    } 
                    break;
                case 8:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Número inválido, tente novamente!");
                    break;
            } 
        

            

        }
    }
}

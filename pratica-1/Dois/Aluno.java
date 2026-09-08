package Dois;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Aluno {
    private String nome;
    private String sobrenome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;
    private LocalDate dataNascimento;
    private String codigoMatricula;
    
    public Aluno() {
        
    }    
    
    public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade, String casa) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.casa = calcularCasa();
        this.criatividade = criatividade;
        this.estrategia = estrategia;
    }
    
    public String getSobrenome() {
        return sobrenome.toUpperCase();
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(dataNascimento, formatador);

        this.dataNascimento = dataFormatada;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }
    public double getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(double criatividade) {
        this.criatividade = criatividade;
    }
    
    public double getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(double estrategia) {
        this.estrategia = estrategia;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = calcularIdade();
    }

    public double getCoragem() {
        return coragem;
    }

    public void setCoragem(double coragem) {
        this.coragem = coragem;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(double ambicao) {
        this.ambicao = ambicao;
    }

    public double getLealdade() {
        return lealdade;
    }

    public void setLealdade(double lealdade) {
        this.lealdade = lealdade;
    }

    public String getCasa() {
        return casa.toUpperCase();
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    private int calcularIdade() {        
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        return periodo.getYears();
    }

    public String nomeCompleto() {
        return nome + sobrenome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nomeCompleto());
        System.out.println("Idade: " + this.idade);
        System.out.println("Coragem: " + this.coragem);
        System.out.println("Inteligência: " + this.inteligencia);
        System.out.println("Ambição: " + this.ambicao);
        System.out.println("Lealdade: " + this.lealdade);
        System.out.println("Casa: " + getCasa());
    }

    public String calcularCasa(){
        double corvinal = (2*inteligencia) + criatividade;
        double grifinoria = (2*coragem)+lealdade;
        double lufalufa = ((2*lealdade)+(coragem))/3;
        double sonserina = (2*ambicao)+estrategia;
        this.casa = "Grifinória";
        double pontuacao = grifinoria;

        if (pontuacao < corvinal){
            pontuacao = corvinal;
            this.casa = "Corvinal";
        }if (pontuacao < lufalufa) {
            pontuacao = lufalufa;
            this.casa = "Lufa-Lufa";
        }if (pontuacao <  sonserina) {
            pontuacao =  sonserina;
            this.casa = "Sonserina";
        }
        return this.casa;
    }

    public String verificarMaioridade() {
        if(idade >= 17) {
            return "Maior de idade";
        }else {
            return "Menor de idade";
        }
    }

    public String gerarLogin() {
        return getNome().toUpperCase().charAt(0) + getSobrenome().toLowerCase();
    }

    public String gerarMatricula(int posicao) {
        return nome.charAt(0) + sobrenome.charAt(0) + "-" + LocalDate.now().getYear() + "-" + posicao+1;
    }

    public boolean verificarCasa(String casa) {
        return this.casa.equals(casa);
    }

    public boolean verificarPalara(String palavra) {
        return sobrenome.contains(palavra);
    }
}
package Um;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;


    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularIMC() {
        double IMC = (this.peso) / Math.pow(altura, 2);
        return IMC;
    }

    public String InformaObesidade(double IMC) {
        if (IMC > 40){
            return "Obesidade grau 3";
        }
        else if (IMC > 34.9 && IMC< 40){
            return "Obesidade grau 2";
        }
        else if (IMC > 29.9 && IMC< 35){
            return "Obesidade grau 1";
        }
        else if (IMC > 24.9 && IMC< 30){
            return "Sobrepeso";
        }
        else if (IMC > 18.4 && IMC< 25){
            return "Peso normal";
        } else {
            return "Abaixo do peso";
        }
    }
}

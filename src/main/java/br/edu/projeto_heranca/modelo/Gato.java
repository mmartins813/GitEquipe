package main.java.br.edu.projeto_heranca.modelo;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String emitirSom() {
        return "O gato mia: Miau!";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cor='" + cor + '\'' +
                '}';
    }
}
package entities.classes.mae;

public class Heroi {

    private String nome;
    private double vida;

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void receberDano(double dano) {
        vida -= dano;
    }

    public void exibirVida() {
        System.out.println("|  Sua vida atual é: " + vida);
    }
}

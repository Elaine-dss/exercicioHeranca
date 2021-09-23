package entities.classes.mae;

public class Inimigos {

    private String nome;
    private double vida;

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
        System.out.println("|  A vida atual do inimigo é: " + vida);
    }
}

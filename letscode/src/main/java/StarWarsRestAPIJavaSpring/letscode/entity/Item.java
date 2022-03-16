package StarWarsRestAPIJavaSpring.letscode.entity;

public class Item {

    private String nome;
    private int pontos = 0;
    private int quantidade = 1;

    public Item(String nome, int pontos, int quantidade) {
        this.nome = nome;
        this.pontos = pontos;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}

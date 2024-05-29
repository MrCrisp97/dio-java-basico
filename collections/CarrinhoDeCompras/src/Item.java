public class Item {

    private String nome;
    private Double preco;
    private int quantidade;
    
    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "[produto=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}



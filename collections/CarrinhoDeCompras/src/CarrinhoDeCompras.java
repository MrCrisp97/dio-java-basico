import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> carrinholist;

    public CarrinhoDeCompras() {
        this.carrinholist = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinholist.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!carrinholist.isEmpty()) {
            for (Item i: carrinholist){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            carrinholist.removeAll(itemParaRemover);
        } else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public Double calcularValorTotal(){
        Double valorTotal = 0d;
        if (!carrinholist.isEmpty()) {
            for (Item i: carrinholist){
                Double precoPorProduto = i.getPreco() * i.getQuantidade();
                valorTotal += precoPorProduto;
            }
            return valorTotal;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }

    }
    
    public void exibirItens(){
        System.out.println(carrinholist);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

        carrinhoCompras.adicionarItem("Tomate", 5.50, 2);
        carrinhoCompras.adicionarItem("Arroz", 20.0, 1);
        carrinhoCompras.adicionarItem("Ovo", 7.0, 2);
        carrinhoCompras.adicionarItem("Queijo", 5.0, 1);
        carrinhoCompras.adicionarItem("Alface", 2.50, 1);

       System.out.println("O valor total dos produtos é R$" + carrinhoCompras.calcularValorTotal());

    }



}

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for (Integer n:numerosList){
                soma += n;
            }
        return soma;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numerosList.isEmpty()) {
            for (Integer n:numerosList){
                if (n>maiorNumero){
                    maiorNumero=n;
                }
            }
        return maiorNumero;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(67);
        somaNumeros.adicionarNumero(34);
        somaNumeros.adicionarNumero(1);

        System.out.println("A soma dos números é de " + somaNumeros.calcularSoma());
        System.out.println("O maior número é " + somaNumeros.encontrarMaiorNumero());
    }


}

import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        
        System.out.println("Digite o canal");
        int escolhaCanal = scanner.nextInt();
        smartTv.mudarCanal(escolhaCanal);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}


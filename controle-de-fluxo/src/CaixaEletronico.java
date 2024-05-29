public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        else if (valorSolicitado == saldo)
            System.out.println("O seu saldo ficou zerado");
        else
            System.out.println("Não há saldo suficiente");
        
        double saque = saldo - valorSolicitado;
        String saldoFinal = saque >=0 ? "Saque realizado" : saque < 0 && saque >= -10 ? "Usado limite do Cheque Especial" : "Saldo insuficiente";
        System.out.println(saldoFinal);

    }

}
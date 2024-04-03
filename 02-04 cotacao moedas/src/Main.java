import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando obj de receber texto
        Scanner scanner = new Scanner(System.in);

        //Recebendo valor do dolar
        System.out.print("Informe o valor atual do dolar:");
        double dolar = scanner.nextDouble();

        //Recebendo valor a ser convertido
        System.out.print("\nInforme o valor a ser convertido:");
        double valor = scanner.nextDouble();

        CotacaoMoeda objCotacao = new CotacaoMoeda(dolar);

        System.out.print("\nO valor é igual a " + objCotacao.cotacao(valor));
    }
}
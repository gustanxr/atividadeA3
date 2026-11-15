import java.util.Scanner;

public class Troco {
    public static void main(String[] agrs) {

        int[] reais = { 10000, 5000, 2000, 1000, 500, 200, 100 };
        int[] centavos = { 50, 25, 5, 1 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor a da compra: ");
        double valorCompra = sc.nextDouble();

        System.out.print("Insira o valor a que o cliente deu: ");
        double valorPago = sc.nextDouble();

        double result = valorPago - valorCompra;
        System.out.println(result);

        if (result == 0) {
            System.out.println("Nao ha troco");
        } else {
            // validar valor pago
            while (result < 0) {
                System.out.println("Valor pago e menor do que o da compra");
                valorPago = sc.nextDouble();
                result = valorPago - valorCompra;
            }

            double troco = result * 100 + 0.5;

            for (int i = 0; i < reais.length; i++) {
                int quantidade = (int) (troco / reais[i]);
                if (quantidade > 0) {
                    System.out.println(quantidade + " nota(s) de R$ " + (reais[i] / 100));
                    troco %= reais[i];
                }
            }

            for (int i = 0; i < centavos.length; i++) {
                int quantidade = (int) (troco / centavos[i]);
                if (quantidade > 0) {
                    System.out.println(quantidade + " moeda(s) de R$ " + (centavos[i] / 100));
                    troco %= centavos[i];
                }
            }
        }
        sc.close();

    }

}

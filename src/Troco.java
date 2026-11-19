
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {

        int[] reais = {10000, 5000, 2000, 1000, 500, 200};
        int[] centavos = {100, 50, 25, 10, 5, 1};

        Scanner sc = new Scanner(System.in);
        
        // validar valor da compra
        System.out.print("Insira o valor da compra: ");
        double valorCompra = sc.nextDouble();

        while (valorCompra < 0.01) {
            valorCompra = sc.nextDouble();
            if (valorCompra < 0.01) {
                System.out.println("insira um valor acima de zero");
            }
        }

        // validar valor dado pelo cliente
        System.out.print("Insira o valor que o cliente deu: ");
        double valorPago = sc.nextDouble();

        while (valorPago < valorCompra) {
            System.out.println("Valor pago é menor do que o da compra");
            valorPago = sc.nextDouble();
        }

        // calcular troco e muda para int
        int troco = (int) Math.round((valorPago - valorCompra) * 100);

        System.out.printf("Troco: R$ %.2f%n", troco / 100.0);

        // imprimir troco
        if (troco == 0) {
            System.out.println("Nao ha troco");
        } else {

            for (int i = 0; i < reais.length; i++) {
                double quantidade = troco / reais[i];

                if (quantidade > 0) {
                    System.out.println(quantidade + " nota(s) de R$ " + (reais[i] / 100));
                    troco %= reais[i];
                }
            }

            for (int i = 0; i < centavos.length; i++) {
                int quantidade = troco / centavos[i];

                if (quantidade > 0) {
                    System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, centavos[i] / 100.0);
                    troco %= centavos[i];
                }
            }
        }

        sc.close();
    }
}

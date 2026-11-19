import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        int opcao = 0;
        boolean continuar = true;

        while (continuar) {

        opcao = 0;

        while (opcao < 1 || opcao > 3) {

            System.out.println("\nEscolha uma forma geometrica:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Trinagulo");
            System.out.println("3 - Triangulo e Quadrado");

            opcao = scanner.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("opção invalida. Escolha novamente!");
            }
        }
            
        switch (opcao) {

            case 1:{//Quadrado
            System.out.print("Digite a proporção: ");
        int tamanho = scanner.nextInt();
            for(int i = 1; i <= tamanho;i++){
                for(int j = 1; j <= tamanho; j++){
                     System.out.print(caractere + " ");
                }
                System.out.println();
            }
                
               
                break;
            }
            
            case 2:{//Triangulo
                System.out.print("Digite a proporção: ");
            int tamanho = scanner.nextInt();
            
            for(int i = 1; i <= tamanho; i++){
                for ( int j = 1; j <= tamanho - i; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
            System.out.print(caractere + " ");
        }
        System.out.println();
            }
                break;
            }
            
            
            
             case 3: { // Triangulo e quadrado 
                System.out.print("Digite a proporção: ");
                int tamanho = scanner.nextInt();

                for (int i = 1; i <= tamanho; i++) {

                    // Triangulo
                    for (int j = 1; j <= tamanho - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(caractere + " ");
                    }
                    // Espacos para alinhar o separador
                    for (int j = 1; j <= tamanho - i; j++) {
                        System.out.print(" ");
                    }

                    // Separador
                    System.out.print(" | ");

                    // Quadrado
                    for (int j = 1; j <= tamanho; j++) {
                        System.out.print(caractere + " ");
                    }

                    System.out.println();
                }

                break;
             }

            default:
                System.out.println("Opcao invalida!");
        }

        System.out.print("Escolher outra forma? (s/n): ");
        char resposta = scanner.next().charAt(0);

        if (resposta != 's' && resposta != 'S') {
            continuar = false;
            System.out.println("Até mais!");
        }

        }

        scanner.close();
    }
}

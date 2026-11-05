
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        System.out.println("\nEscolha uma forma geometrica:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Triangulo");
        System.out.println("4 - Losango");
        System.out.println("5 - Circulo");

        int opcao = scanner.nextInt();
        

    
            
        switch (opcao) {

            case 1:{//Quadrado
            System.out.print("Digite a proporcao: ");
        int tamanho = scanner.nextInt();
            for(int i = 1; i <= tamanho;i++){
                for(int j = 1; j <= tamanho; j++){
                     System.out.print(caractere + " ");
                }
                System.out.println();
            }
                
               
                break;
            }

            case 2:{//Retangulo
                    int altura;
                    int largura;
                        
            System.out.print("Digite a altura: ");
                altura = scanner.nextInt();

             System.out.print("Digite a largura: ");
                largura = scanner.nextInt();
                                        
                   for(int i = 1; i <= altura;i++){
                for(int j = 1; j <= largura; j++){
                     System.out.print(caractere + " ");
                }
                System.out.println();
            }
            
                break;
            }
            
            case 3:{//Triangulo
                System.out.print("Digite a proporcao: ");
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
            
            case 4:{//Losango

    System.out.print("Digite a proporcao: ");
    int tamanho = scanner.nextInt();

    // Parte superior do losango
    for (int i = 1; i <= tamanho; i++) {

        // Espaços iniciais
        for (int j = 1; j <= tamanho - i; j++) {
            System.out.print("  ");
        }

        // Caracteres
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print(caractere + " ");
        }

        System.out.println();
    }

        for (int a = tamanho - 1; a >= 1; a--){
             for (int b = 1; b <= tamanho - a; b++) {
            System.out.print("  ");
        }

        // Caracteres
        for (int c = 1; c <= 2 * a - 1; c++) {
            System.out.print(caractere + " ");
        }
        System.out.println();
        }                
                break;
            }
            
           case 5: { // Circulo

    System.out.print("Digite o raio: ");
    int raio = scanner.nextInt();

    for (int y = -raio; y <= raio; y++) {

        for (int x = -raio; x <= raio; x++) {

            if(x*x + y*y <= raio*raio ){
                System.out.print(caractere+" ");
            } 
            else {
                System.out.print("  ");
            }   

        }

        System.out.println();
    }

    break;
}

            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}

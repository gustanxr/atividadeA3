
import java.util.Scanner;

public class Geometria {

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
        
        System.out.print("Digite a proporcao: ");
        int tamanho = scanner.nextInt();

        System.out.println("\nCaractere escolhido: " + caractere);
        System.out.println("Forma escolhida: " + opcao);
        System.out.println("Proporcao escolhida: " + tamanho);
            
        switch (opcao) {

            case 1://Quadrado
            
            for(int i = 1; i <= tamanho;i++){
                for(int j = 1; j <= tamanho; j++){
                     System.out.print(caractere + " ");
                }
                System.out.println();
            }
                
               
                break;

            case 2://Retangulo
                
                break;

            case 3://Triangulo
                
                break;

            case 4://Losango
                
                break;

            case 5: //Circulo
                
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Geometria{
    public static void main(String []agrs){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Insira um caractere: ");
        char charactere = sc.next().charAt(0);

        System.out.println("Qual porpocao");
        int tamanho = sc.nextInt();
        
        // validando tamanho
        while (tamanho <= 0) {
            tamanho = sc.nextInt();
            if (tamanho <= 0) {
                System.out.println("Insira um numero maior que zero");
            }
        }
        
        System.out.println("Ecolha uma imagem \n - Triangulo \n - Quadrado \n - Triangulo Quadrado \n - Sair");
        String geometria = sc.nextLine();

        

        // verifacacao se o usuario digitou uma opcao valida
        while (!geometria.equalsIgnoreCase("Triangulo") && !geometria.equalsIgnoreCase("Quadrado") && !geometria.equalsIgnoreCase("Traingulo Quadrado") && !geometria.equalsIgnoreCase("Sair")) {
            geometria = sc.nextLine();
            if (!geometria.equalsIgnoreCase("Triangulo") && !geometria.equalsIgnoreCase("Quadrado") && !geometria.equalsIgnoreCase("Traingulo Quadrado") && !geometria.equalsIgnoreCase("Sair")) {
                System.out.println("Insira um opção valida");
            }
            else if (geometria.equalsIgnoreCase("Sair")){
                System.out.println("Programa Encerrado");
            }
            if (geometria.equalsIgnoreCase("Triangulo")){
                for (int i = 0; i <= tamanho ; i++ ){
                    System.out.print(" ");
                }
                for (int j = 0; j <= tamanho; j++){
                    System.out.println(charactere);
                }
            }
            else if(geometria.equalsIgnoreCase("Quadrado")){
                System.out.println(" ");
                System.out.println(charactere);
            }
            else if(geometria.equalsIgnoreCase("Traingulo Quadrado")){
                System.out.println(" ");
                System.out.println(charactere);
            }
        }



        sc.close();
    }
}
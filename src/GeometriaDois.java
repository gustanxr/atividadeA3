import java.util.Scanner;

public class GeometriaDois {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um caractere");
        char[] character = sc.nextLine().toCharArray();

        System.out.println("Insira a proporcao desejada");
        int numero = sc.nextInt();
        while(numero <= 0){
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("inisira um numero maior que zero");
            }
        }
        numero *= character.length;

        System.out.println("EScolha uma opcao");
        String chose = sc.nextLine();


        if (chose.equals("Quadrado")) {
            System.out.println(numero);
        }

    }
}

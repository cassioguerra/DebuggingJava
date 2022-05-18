import java.util.Scanner;

public class conpras {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] material = { "doce", "revista", " cafe" };

        double valor_total = valorCompra (material, leia);
        System.out.println("");
        System.out.println(" valor total da sua compra :" +valor_total);
    }

    public static double valorCompra(String[] material, Scanner scanner) {
        double valor  = 0;

        for (String materiais : material) {
            System.out.println("");
            System.out.println(" valor do material: " + materiais);
          double  soma = scanner.nextDouble();
            valor += soma;


        }

        return valor  ;
    }
}

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.product01;

public class exemplo01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        product01[] vect = new product01[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new product01(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}
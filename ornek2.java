import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sıcaklık değerini girin: ");

        double sıcaklık=oku.nextDouble();

        if (sıcaklık <= 5) {
            System.out.println("Çok soguk");
        } else if (sıcaklık > 5 && sıcaklık <= 20) {
            System.out.println("Soguk");

        } else if (sıcaklık > 20 && sıcaklık <= 27) {
            System.out.println("Normal");
        } else if (sıcaklık > 27 && sıcaklık <= 35) {
            System.out.println("Sıcak");
        } else {
            System.out.println("Çok sıcak");
        }


    }

}

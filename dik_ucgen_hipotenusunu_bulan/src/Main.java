import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a_kener,b_kenar;
        double c_kenar;

        System.out.print("A kenar uzunlugu giriniz: ");
        a_kener = input.nextInt();
        System.out.print("B kenar uzunlugu giriniz: ");
        b_kenar = input.nextInt();

        c_kenar = Math.sqrt((a_kener * a_kener) + (b_kenar * b_kenar));
        System.out.println("Üçgenin Hipotenüsü: " + c_kenar);


    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number;
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) { // kaç satır olacagını belirliyoruz

            for (int k = number; k >= i; k--) { // boşlukları ayarlıyoruz
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
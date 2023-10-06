import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter,number,min = 0,max = 0;

        System.out.print("Kaç Adet Sayı Gireceksin?:  ");
        counter = input.nextInt();

        while (counter != 0){
            System.out.print("Sayıları Giriniz: ");
            number = input.nextInt();

            if (number > max) {
                 max = number;
            }

            else if (number < min) {
                 min = number;
            }
            counter--;
        }
        System.out.println("Büyük Sayı: "+max);
        System.out.println("Küçük Sayı: "+min);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km;
        double perkm=20,startPrice=10,total;

        System.out.print("Lütfen KM Giriniz: ");
        km = input.nextInt();
        total = startPrice + (km * 2.20d) ;
        total = (total <= 20) ? 20 : total;

        System.out.println("Ödenecek Tutar: " + total + " TL");
    }
}
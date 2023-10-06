import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double boy, vki;
        int kilo;

        System.out.print("Lütfen Boyunuzu (cm cinsinden) Giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = input.nextInt();
        double boy1 = boy / 100;
        vki = kilo / (boy1 * boy1);

        System.out.print("Vucut Kitle İndeksiniz: " + vki);

    }
}
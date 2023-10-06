import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double urun,kdv,kdv_tutari,kdvli_fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Ürün Fiyatını Giriniz: ");
        urun = input.nextDouble();
        kdv = 0.18;
        kdv_tutari = (urun * kdv);
        kdvli_fiyat = kdv_tutari + urun;

        System.out.println("Ürün KDV'siz Fiyatı: " + urun);
        System.out.println("Ürün KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdv_tutari);
        System.out.println("Ürün KDV Eklenmiş Fiyatı: " + kdvli_fiyat);
    }
}
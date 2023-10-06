import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Lütfen Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.print("Lütfen Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0d;
        System.out.println("Ortalamanız: "+sonuc);
        boolean durum = (sonuc >= 60);
        String result = durum ? "Geçtiniz" : "Kaldınız";
        System.out.println(result);

    }
}
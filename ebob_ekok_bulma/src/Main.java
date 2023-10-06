import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N1 Sayısını Giriniz: ");
        int n1 = input.nextInt();

        System.out.print("N2 Sayısını Giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1;

        for (int i = n1; i >= 1; i-- ){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                  System.out.println(ebob);
                  break;
            }
        }
 /*

        for (int j = 1; j <= (n1 * n2); j++){
            if (j % n1 == 0 && j % n2 == 0){
                ebob = j;

                break;
            }
        }

  */


        for (int k = 1; k <= (n1 * n2); k++){
            if (k%n1 == 0 && k%n2 == 0){
                System.out.println("EKOK = "+k);
                break;
            }
        }
        System.out.println("EKOK = " +(n1 * n2) / ebob);


    }
}
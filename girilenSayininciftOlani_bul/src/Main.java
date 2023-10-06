import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int k,i=0,j=0;
       Scanner inp = new Scanner(System.in);

       System.out.print("Lütfen Bir Sayı Giriniz: ");
       k = inp.nextInt();

      /* for (int i = 1; i <= k; i++){
           if (i % 2 == 0){
               System.out.println(i);
           }
       }*/
        while (i < k){
            if ((i %3 == 0) && (i %4 == 0)){
                System.out.println(i);
            }
            i++;
        }


    }
}
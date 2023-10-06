import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 100;



        for (int i = 2; i <= number; i++){
            int count = 0;

            for (int k = 2; k < i; k++){
                if (i % k == 0){
                    count++;
                }
            }
            if (count == 0){
                System.out.println(i + " ");
            }
            //System.out.println(count);
        }

    }
}
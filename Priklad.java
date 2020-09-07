import java.util.Scanner;

public class Priklad {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cislo;


        System.out.println("zadej cislo");
        cislo = sc.nextInt();

        if(cislo % 7 == 0) {
        System.out.println("cislo je delitelne 7");
        }
        else {
        System.out.println("cislo neni delitelne 7");
        }
    
    

        for (int i = 1; i <= 100; i++) {
            int x = 0;
            for (int number = i; number >= 1; number--) {
                if (i % number == 0) {
                    x++;
                }
            }
            if (x == 2) {
                System.out.println(i);
            }
        }
    }
}
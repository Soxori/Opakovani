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
    }
    
    public static void prvocisla() {

        for(int i = 0; i <= 100; i++) {
            int x = 0;

            for(int cislo = i; cislo >= 1; cislo--){
                if( i % cislo == 0);
                x++;
            }
        }
    }
}
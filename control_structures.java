import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

         int nmb = (int)(Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println(nmb);


        //for method


         for (int i=3; i>0; i--) {

                System.out.print(" Kalan Hakkınız:"+i + "\t");
                System.out.println("Tahmininizi Girin :");

                int g = sc.nextInt();
                if (g==nmb) {

                    System.out.println("Tebrikler.");
                  break;
                }
               else {
                    System.out.println("Bilemedin.");
                }

            }

        //while method
        /*
         int i=3;
         while (i>0){
             System.out.print(" Kalan Hakkınız:"+i + "\t");
             System.out.println("Tahmininizi Girin :");

              i--;
             int g = sc.nextInt();
             if (g==nmb) {

                 System.out.println("Tebrikler.");
                 break;
             }
             else {
                 System.out.println("Bilemedin.");
             }


         } */

      // do-while method
      /*
        int i=3;
    do {

        System.out.print(" Kalan Hakkınız:"+i + "\t");
        System.out.println("Tahmininizi Girin :");

        i--;
        int g = sc.nextInt();
        if (g==nmb) {

            System.out.println("Tebrikler.");
            break;
        }
        else {
            System.out.println("Bilemedin.");
        }

    }
    while (i>0);
*/

    }
}
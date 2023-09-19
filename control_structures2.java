import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

         Scanner scn = new Scanner(System.in);

        System.out.println("1-7 arasında bir rakam tuşlayın.");

        int num = scn.nextInt();

     /*   if (num >= 1 && num <= 7)
        {
            if (num==1 )       System.out.println("Sectiginiz Gün Pazartesi ");
            else if (num==2)   System.out.println("Sectiginiz Gün Sali ");
            else if (num==3)   System.out.println("Sectiginiz Gün Carsamba");
            else if (num==4)   System.out.println("Sectiginiz Gün Persembe ");
            else if (num==5)   System.out.println("Sectiginiz Gün Cuma ");
            else if (num==6)   System.out.println("Sectiginiz Gün Cumartesi ");
            else if (num==7)   System.out.println("Sectiginiz Gün Pazar ");


        }
        else {
            System.out.println("Hatali Tuslama Yaptiniz.");


        } */

        switch (num) {

            case 1:
                System.out.println("Sectiginiz gün pazartesi"); break;

            case 2:
                System.out.println("Sectiginiz gün sali"); break;
            case 3:
                System.out.println("Sectiginiz gün carsamba"); break;
            case 4:
                System.out.println("Sectiginiz gün persembe"); break;
            case 5:
                System.out.println("Sectiginiz gün cuma"); break;
            case 6:
                System.out.println("Sectiginiz gün cumartesi"); break;
            case 7:
                System.out.println("Sectiginiz gün pazar"); break;
            default:
                System.out.println("Yanlıs tuslama yaptiniz.");
 

        }

    }
}
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int a = 4;
        float b = 14.009f;
        double c = 42.01201;
        char d = 'c';
        String e = "Hiiiii";
        boolean isThatTrue = false;
        byte f = 127;
        long g = 1231212312;

        System.out.println(a + "\n" + b +  "\n" + c +  "\n" + d +  "\n" + e +  "\n" + isThatTrue +  "\n" + f +  "\n" + g+  "\n");
        System.out.println("--- Casting ---");

        double val = (double) a;
        System.out.println(val);

        int val1 = (int) c;
        System.out.println(val1);

        float val2 = (float) g;
        System.out.println(val2);

     }




}
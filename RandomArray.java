import java.rmi.MarshalException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RandomArray {

    public static void main(String[] args)
    {
            ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
        {
            int a = (int) (Math.random()* 100 + 1);
            int b = (int) (Math.random()* 100 + 1);
            x.add(a);
            y.add(b);
        }


        System.out.println("A: "+x );
        System.out.println("B: "+y);


        System.out.println("Iki array ortak elemanları : ");
        y.retainAll(x);
        System.out.println(y + "\n");


        System.out.println("X arrayinde olup Y arrayinde olmayanlar: \n ");
         x.removeAll(y);

        System.out.println(x +  "\n");


            System.out.println("Y arrayinde olup X arrayinde olmayanlar: \n ");
             y.removeAll(x);
            System.out.println(y + "\n");




    }
}

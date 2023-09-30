import java.util.Arrays;


public class ArraysTest {

    public static void main(String[] args){

        String[] colors ={"Black","Blue","Brown","Red","White"};

        Arrays.sort(colors);
        System.out.println("Dizideki renkler: "+ Arrays.toString(colors));
        System.out.println("Dizideki ilk eleman "+colors[0] + " \n Dizideki son eleman "+colors[4]);



    }
}

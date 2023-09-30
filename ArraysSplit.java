import java.util.Scanner;

public class ArraysSplit {

    public  static void main(String[] Args){

        String colors = "Black,Purple,White,Gray,Orange";
        String[] split = colors.split(",",0);

         for (int i=0; i<split.length; i++){

             System.out.println(split[i]);


         }
        System.out.println("Dizi uzunluğu: "+split.length);





    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ListMethods {

    public static void main(String[] args){

        ArrayList<String> guys = new ArrayList<String>();

        // add method

        guys.add("Lvbel");
        guys.add("Cezar");
        guys.add("Maradona");
        guys.add("Aykut");

        // contains method
        /* Scanner scn = new Scanner(System.in);

       System.out.println("Denemek istediğiniz yazıyı yazınız.");
        String a = scn.next();
        boolean isThat = guys.contains(a);

        if (isThat)
        {
            System.out.println("Listede bulunuyor.");
        }

        else
        {
            System.out.println("Listede bulunmuyor.");

        }*/

        // size method

        System.out.println("Dizideki Elaman Sayısı : " + guys.size());


       // remove method

        /*
         guys.remove("Lvbel");
        System.out.println(guys);
       */


        // removeall method
/*
        ArrayList<String> gwl = new ArrayList<String>();

        gwl.add("Lvbel");
        gwl.add("Cezar");

        guys.removeAll(gwl);
        System.out.println(guys);
*/

        // addall method

   /*      ArrayList<String> gwl = new ArrayList<String>();
        gwl.add("Murda");
        gwl.add("Purple");
        gwl.add("Cat");

         guys.addAll(gwl);
        System.out.println(guys);
*/


        // isempty method
/*
        ArrayList<String> gwl = new ArrayList<String>();

        boolean ans = gwl.isEmpty();
        if (ans)
        {

            System.out.println("Dizi Boş");
        }

        else {
            System.out.println("Dizi eleman bulunduruyor.");
        }
*/

        // get method
/*
        String ask = guys.get(1);
        System.out.println(ask);
*/

        
        /* clear method

        guys.clear();
        System.out.println(guys);
      */


        // containsall method

     /*  ArrayList<String> con = new ArrayList<String>();

        con.add("Cezar");
        con.add("Aykut");

        System.out.println("Bütün elemanlar guys dizisinde bulunuyor mu? " + guys.containsAll(con));
*/

        // indexof - lastindexof method

           ArrayList<Integer> numb = new ArrayList<Integer>();

           numb.add(4);
           numb.add(1);
           numb.add(6);
           numb.add(1);
           numb.add(4);
           numb.add(6);
           numb.add(5);


           int a = numb.indexOf(6);
         System.out.println(a);    //indexof

        int check = numb.lastIndexOf(6);   //lastidexof
        if (check != -1){

            System.out.println("The last index of 6 is:  " +check);


        }

        else   System.out.println("There is no such element like your choose ");

         //set method

        System.out.println("Before set method: "+ numb.toString());

        numb.set(1,42);

        System.out.println("After set method: "+numb.toString());

        //sublist method

        System.out.println(numb.subList(1,4));






    }

}

package sandbox;

import sandbox.Automobile;

public class Solution {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);



      SubClass s2 = new SubClass();
      Writer w = new Programmer();
      //Programmer w2 = (Programmer)w;
      //Programmer w2 = w;
      //w2.write();




        Automobile myAuto = new Automobile();
        System.out.println(myAuto.toString());


      Automobile myAuto2 = new Automobile();
      System.out.println(myAuto2.toString());

      printHello();

    }

    public static void printHello() {

      System.out.println("hello");
    }
}

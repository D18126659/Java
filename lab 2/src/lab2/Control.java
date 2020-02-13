package lab2;

import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
        Animal a0= new Animal("Bob","duck",3,"black","Yes");
        Animal a1= new Animal("charlie","Cat",2,"Black and yellow","Yes");
        Animal a2= new Animal("Roxy","Dog",6,"white","Yes");
        Animal a3= new Animal("richard","Platypus",2,"Brown","no");

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        Scanner input= new Scanner(System.in);
        System.out.println("Enter Something >>");
        String inputString=input.nextLine();
        System.out.println("you Entered: ");
        System.out.println(inputString);

    }
}
{}

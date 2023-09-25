package com.company;
import java.util.Scanner; // слово Import помогает импортировать
public class Main {

    public static void main(String[] args) {
	    int x;
        String y;
        Scanner console = new Scanner(System.in); // java.util.Scanner(позволяет вносить данные)

        System.out.print("Your age:");
        x = console.nextInt();

        System.out.print("Your name:");
        y = console.next();

        System.out.printf("Your age is %d Your name is %s \n", x, y);
        console.close();

       if ( x >= 18)
       {
           System.out.print("Beer Tine");
       }
       else if (x > 0 && x < 18)
       {
           while (x < 18)
           {
               System.out.println("Прошёл год");
               x = x+1;
           }
           System.out.print("BEER TIME!");
       }
       else
           System.out.print("Wat");
    }
}

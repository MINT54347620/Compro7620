
package th.ac.nu.student.u54347620.compro.ch01;
import java.util.Scanner;
public class HomeWork5 {
   
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Card Notation:");
        String input = in.next();
        String value = input.substring(0, 1);
        String type = input.substring(1, 2);
        if(value.equals("a")||value.equals("A")){
            value = "Ace";
        }
        if(value.equals("j")||value.equals("J")){
            value = "Jack";
        }
        if(value.equals("q")||value.equals("Q")){
            value = "Queen";
        }
        if(value.equals("k")||value.equals("K")){
            value = "King";
        }
        if(value.equals("2")||value.equals("3")||value.equals("4")||value.equals("5")
                ||value.equals("6")||value.equals("7")||value.equals("8")||value.equals("9")){
            value = "Card Values";
        }
        
        if(type.equals("d")||type.equals("D")){
            type = "Dimonds";
        }
        if(type.equals("h")||type.equals("H")){
            type = "Hearts";
        }
        if(type.equals("s")||type.equals("S")){
            type = "Spades";
        }
        if(type.equals("c")||type.equals("C")){
            type = "Clubs";
        }
        
        System.out.println(value+" of "+type);
    }
}


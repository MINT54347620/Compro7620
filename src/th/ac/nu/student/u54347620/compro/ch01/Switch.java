
package th.ac.nu.student.u54347620.compro.ch01;
import java.util.Scanner;
public class Switch {
    public static void maim(String [] args){
        Scanner in = new Scanner(System.in);
        char graed = in.next().charAt(0);
        switch (graed){
            case 'A':
                System.out.println("Excellent");
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("So so");
            case 'D':
                System.out.println("Fails");
            case 'F':
                System.out.println("Get Lost");
            default:
                System.out.println("Invalid");
        }
    }
}


package th.ac.nu.student.u54347620.compro.ch01;
import java.util.Scanner;
public class Switch1 {
    public static void main(String [] args){
        Scanner in =  new Scanner(System.in);
        char graed = in.next().charAt(0);
        switch (graed){
            case 'A':               
            case 'B':
            case 'C':
                System.out.println("Passes");
                break;
            case 'D':
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

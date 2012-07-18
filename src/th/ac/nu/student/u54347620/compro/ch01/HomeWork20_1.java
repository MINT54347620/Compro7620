
package th.ac.nu.student.u54347620.compro.ch01;

import java.util.Scanner;

public class HomeWork20_1 {
    public static void main(String args[]) {
        
    Scanner in = new Scanner(System.in);
    
    String string = "January Febuary March April May June July August September October November December";
    System.out.print("Enter Number(1-12): ");
    int month = in.nextInt();

        switch (month) {
        case 1:
        System.out.println(string.substring(0, 7));
        break;
        case 2:
        System.out.println(string.substring(8, 15));
        break;
        case 3:
        System.out.println(string.substring(16, 21));
        break;
        case 4:
        System.out.println(string.substring(22, 27));
        break;
        case 5:
        System.out.println(string.substring(28, 31));
        break;
        case 6:
        System.out.println(string.substring(32, 36));
        break;
        case 7:
        System.out.println(string.substring(37, 41));
        break;
        case 8:
        System.out.println(string.substring(42, 48));
        break;
        case 9:
        System.out.println(string.substring(49, 58));
        break;
        case 10:
        System.out.println(string.substring(59, 66));
        break;
        case 11:
        System.out.println(string.substring(67, 75));
        break;
        case 12:
        System.out.println(string.substring(76, 84));
        break;

        }
    }
}

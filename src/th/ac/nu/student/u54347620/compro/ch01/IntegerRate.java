
package th.ac.nu.student.u54347620.compro.ch01;

public class IntegerRate {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("Overflow:");
        System.out.println(max); // 2147483647
        System.out.println(max + 1); // -2147483648
        System.out.println(max + 2); // -2147483647

           int min = Integer.MIN_VALUE;
           System.out.println("Unceerflow:");
           System.out.println(min); // -2147483648
           System.out.println(max - 1); // 2147483647
           System.out.println(max - 2); // 2147483646
           
   }
}

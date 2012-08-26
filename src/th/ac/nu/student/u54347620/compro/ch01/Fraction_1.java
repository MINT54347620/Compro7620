
package th.ac.nu.student.u54347620.compro.ch01;

public class Fraction_1 {
    public static void main(String[] args) {
        printfrac(6);
    }
        public static void printfrac(int Lines){
            int numerator = 1;
            int denominator = 2;
            while (denominator < Lines){
            System.out.println(numerator+"/"+denominator+"="+(double)numerator/denominator);
            denominator++;
            }
        }
}


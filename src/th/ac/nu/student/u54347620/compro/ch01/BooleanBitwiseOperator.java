
package th.ac.nu.student.u54347620.compro.ch01;

public class BooleanBitwiseOperator {
    public static void main(String[] args) {
        
        final int A = 1234;
        final int B = 9876;
        
        System.out.println("A = " + Integer.toBinaryString(A));//100110110010
        System.out.println("B = " + Integer.toBinaryString(B));//10011010010100
        System.out.println("A & B = " + Integer.toBinaryString(A & B));//10010010000
        System.out.println("A | B = " + Integer.toBinaryString(A | B));//10011011010110
        System.out.println("A ^ B = " + Integer.toBinaryString(A ^ B));//10001001000110
        System.out.println("A >> 4 = " + Integer.toBinaryString(A >> 4));//1001101
        System.out.println("A << 4 = " + Integer.toBinaryString(A << 4));//100110100100000
        System.out.println("~A = " + Integer.toBinaryString(~A));//11111111111111111111101100101101
        System.out.println("-A = " + Integer.toBinaryString(-A));//11111111111111111111101100101110
        System.out.println("-A >> 4 = " + Integer.toBinaryString(-A >> 4));//11111111111111111111111110110010
        System.out.println("-A >>> 4 = " + Integer.toBinaryString(-A >>> 4));//1111111111111111111110110010
        
   }
}

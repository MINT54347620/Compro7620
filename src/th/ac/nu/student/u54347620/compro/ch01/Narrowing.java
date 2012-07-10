
package th.ac.nu.student.u54347620.compro.ch01;

public class Narrowing {
    public static void main(String[] args) {
        
        int i = 32768;
        short s = (short) i;//เปลี่ยน Type จาก int เป็น short
        System.out.println("i = " + i + ", s = " + s); // i = 32768, s = -32768
        
    }
}

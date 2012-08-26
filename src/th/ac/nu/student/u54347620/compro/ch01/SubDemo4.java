
package th.ac.nu.student.u54347620.compro.ch01;

public class SubDemo4 {
    public static void main(String[]args){
        printHello("Hello",5);
        System.out.println("Java");
        printHello("สวัสดีค่ะ",2);
    }
    public static void printHello(String value,int max){
        int counter = 0;
        while(counter < max){
        System.out.println(value);
        counter++;
        
        }
    }
}


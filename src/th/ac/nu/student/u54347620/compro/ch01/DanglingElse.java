
package th.ac.nu.student.u54347620.compro.ch01;

public class DanglingElse {
    public static void main(String []args){
        
     int x = 5;
     if (x < 5){
         if (x > 5){//มันจะอยู่ฝั่ง else ฉนั้นมันจึงไม่เข้าเงื้อนไขจึงไม่มีคำตอบจร้า 
             System.out.println('b');
         }else{
             System.out.println('a');
         }
     }
  } 
}

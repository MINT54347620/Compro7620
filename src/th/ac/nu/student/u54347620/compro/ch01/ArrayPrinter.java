
package th.ac.nu.student.u54347620.compro.ch01;

public class ArrayPrinter {
   public static void main(String[] args) {
       
      int numbers[] = {1, 2, 3, 5, 8, 13};
      int index, initial = 0;
      
      for (index = initial; index < numbers.length; index++) {
      System.out.println("numbers[" + index + "] = " +numbers[index]);
 
      }
   } 
}

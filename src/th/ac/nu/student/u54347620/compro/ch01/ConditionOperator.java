
package th.ac.nu.student.u54347620.compro.ch01;

public class ConditionOperator {
    public static void main(String[] args) {
        
         if(args.length == 2){
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
         System.out.println((a>b)? a : b);
         
         }
    }
}

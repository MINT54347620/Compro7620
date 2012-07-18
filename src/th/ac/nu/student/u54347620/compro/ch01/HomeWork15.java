
package th.ac.nu.student.u54347620.compro.ch01;
import java.util.Scanner;
public class HomeWork15 {
    public static void main(String [] args){
        String name;
        double hours;
        double payRate = 9.25;
        double pay = 13.875;
        double gross,grossPay;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("name : ");
        name = in.nextLine();
        
        System.out.print("How many hours the employee this week : ");
        hours = in.nextDouble();
         
        if(hours <= 40){
            grossPay = hours * payRate;//คำนวน ชั่วโมง x อัตราจ้าง
            System.out.println("Paycheck for you: "+grossPay);
        }else{ 
                gross = hours - 40;//ชั่วโมงเกิน เพิ่ม150%
                grossPay = (gross * pay) + 40 * payRate;
            System.out.println("Paycheak for you: "+grossPay);    
            }
        }  
    }






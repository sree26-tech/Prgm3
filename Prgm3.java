import java.util.Scanner;

public class Prgm3{
        public static void main(String args[]){
            int sub;//declare variable to find subtraction
            Scanner scan=new Scanner(System.in);
//create a scanner instance for receives input
// from the user - input from keyboard
            System.out.print("Enter the value to num1: ");
            int num1=scan.nextInt();
            System.out.print("Enter the value to num2: ");
            int num2=scan.nextInt();
            sub=num2-num1;//find subtract of two numbers
            System.out.print("subtraction of "+num2+"-"+num1+" :"+sub);
//display the subtraction of two numners
        }
    }


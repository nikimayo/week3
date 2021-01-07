package java_three;
import java.util.Scanner;
import java.lang.Math;
public class IsInRectangle {
	 public static void main(String[] args) {
	        System.out.print("Enter a point with two coordinates : ");
	        Scanner input = new Scanner(System.in);
	        double x = input.nextDouble();
	        double y = input.nextDouble();
	        double a = Math.abs(x);
	        double b = Math.abs(y);
	        if(a <= 5 && b <= 2.5){
	            System.out.println("Point ( "+x+" , "+y+" ) is in the rectangle");
	        }else{
	            System.out.println("Point ( "+x+" , "+y+" ) is not in the rectangle");
	        }
	    }

}

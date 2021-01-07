package java_three;
import java.util.Scanner;
public class ISBN {
	 public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
	        String isbn=input.next();
	        int len=isbn.length();
	        int sum=0;
	        for(int i=0;i<len;++i){
	            sum+=(isbn.charAt(i)-'0')*(i+1);
	        }
	        
	        sum=sum%11;
	        System.out.print("The ISBN - 10 number is "+isbn);
	        if(sum==10){
	            System.out.print("x");
	        }else{
	            System.out.println(sum);
	        }
	    }

}

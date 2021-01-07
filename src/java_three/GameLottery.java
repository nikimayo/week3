package java_three;
import java.util.Scanner;
import java.util.Random;
public class GameLottery {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.print("Enter your lottery pick: ");
        Random r = new Random();
        int x=100+r.nextInt(899);
        int a=x/100;
        int c=x%10;
        int b=(x-c-a*100)/10;
        int guess=input.nextInt();
        int a1=guess/100;
        int c1=guess%10;
        int b1=(guess-c1-100*a1)/10;
        if(guess==x){
            System.out.println("You win 10000$");
        }else{
            if((a==a1&&b==c1&&c==b1)||(a==b1&&b==a1&&c==c1)||(a==b1&&b==c1&&c==a1)||(a==c1&&b==a1&&c==b1)||(a==c1&&b==b1&&c==a1)){
                System.out.println("You win3000$");
            }else{
                if((a==a1)||(a==b1)||(a==c1)||(b==a1)||(b==b1)||(b==c1)||(c==a1)||(c==b1)||(c==c1)){
                    System.out.println("You win 1000$");
                }else{
                    System.out.println("Your win 0$");
                }
            }
        }
    }

}

package java_three;
import java.util.Random;
public class Card {
	public static void main(String[] args) {
        Random r = new Random();
        String x = "";
        String y = "";
        int a=1+r.nextInt(13),b=r.nextInt(4);
        switch (a){
            case 1:
                x = "Ace";
                break;
            case 2:
                x= "2";
                break;
            case 3:
                x = "3";
                break;
            case 4:
                x = "4";
                break;
            case 5:
                x= "5";
                break;
            case 6:
                x= "6";
                break;
            case 7:
                x = "7";
                break;
            case 8:
                x= "8";
                break;
            case 9:
                x = "9";
                break;
            case 10:
                x= "10";
                break;
            case 11:
                x= "Jack";
                break;
            case 12:
                x= "Queen";
                break;
            case 13:
                x= "King";
                break;
        }
        switch (b){
            case 0:
                y = "Clubs";
            case 1:
                y= "Diamonds";
            case 2:
                y= "Hearts";
            case 3:
                y = "Spades";
        }
        System.out.println("The card you picked is "+x+" of "+y);
    }
}

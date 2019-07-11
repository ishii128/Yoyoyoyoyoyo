import java.util.Random;
import java.util.Scanner;
public class DICE{
    public static void main(String[] args){
	System.out.println("What is your name?");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.println("Hellow, " + str + "!" );
	
	System.out.println("Rolling the dice...");
	Random rand = new Random();
	int num1 = rand.nextInt(5) + 1;
	int num2 = rand.nextInt(5) + 1;
	System.out.println("Die 1: " + num1);
	System.out.println("Die 2: " + num2);
	System.out.println("Total value : " + (num1+num2));
	if((num1 + num2) > 7){
	    System.out.println(str + " won");
	    System.out.println("やるやん");
		}
	else{
	    System.out.println(str + " lost");
	    System.out.println("貴様は敗北者じゃけぇ");
	}
    }
}

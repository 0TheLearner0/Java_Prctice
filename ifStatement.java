import java.util.Scanner;

public class ifStatement {
	/*
	 * Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
	 */

	private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n=sc.nextInt();
        if(n>=1 && n<=100)
        {
        if(n%2==1)
        {
            System.out.println("Weird");
        }
        if(n>=2 && n<=5 && n%2==0){
            System.out.println("Not Weird");
        }
        
        if(n>=6 && n<=20 && n%2==0){
            System.out.println("Weird");
        }
        if(n>20 && n%2==0)
        {
            System.out.println("Not Weird");
        }
        }
        sc.close();
    }
}

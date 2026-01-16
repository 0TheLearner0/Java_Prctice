import java.util.Scanner;

public class userInput {

//	The java.util.Scanner class is necessary for taking the user inputs.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int age; String name,profession;
	System.out.println("Enter your name? ");
	name=sc.nextLine();
	System.out.println("Enter your age? ");
	age=sc.nextInt();
	System.out.println("Enter your profession? ");
	profession=sc.next();
	System.out.println("My name is "+name+". I am "+age+" years old. And I am an "+profession+".");
	sc.close();
	/*
	 * Why we close the scanner ?
	 * We close the Scanner to release system resources and prevent memory or resource leaks.
	 * In real / large applications:

Memory leaks

Resource exhaustion

Performance issues

Warnings from IDEs
	 */
	}

}

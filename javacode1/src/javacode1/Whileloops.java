package javacode1;
import java.util.Scanner;
public class Whileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
		int c=0;
	    while(c<=7) {
	    	System.out.println(c);
	    	c++;
	    }
	    int b=3;
	    do {
	    	System.out.println(b);
	    	b++;
	    }while(b<=11);
	    //while loop with iteration
		Scanner x=new Scanner(System.in);
		System.out.println("enter d num:");
	    int s=x.nextInt();
	    int sum=0;
	    while(s<=10) {
	    	System.out.println("onlyy abovee 20/2 nums..onlyy validd");
	    	System.out.println("enter d num:");
	    	s=x.nextInt();
	    	sum+=1;
	    }
	    System.out.println(sum);
	    Scanner l=new Scanner(System.in);
	    System.out.println("enter d num:");
	    int y;
	    int sum1=0;
	    do {
	    	System.out.println("type 10...");
	    	System.out.println("enter d num:");
	    	y=l.nextInt();
	    	sum1+=1;
	    }while(y!=10);
	    System.out.println(sum);
	    //not perfecttt...
	    Scanner z=new Scanner(System.in);
	    System.out.println("enter d letter:");
	    String ltr=z.nextLine();
	    while(ltr=="a") {
	    	System.out.println("your letter didnt match our imaginations..pls type again");
	    	System.out.println("enter d letter:");
	    	ltr=z.nextLine();
	    }
	}

}

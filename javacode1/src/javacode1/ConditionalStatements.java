package javacode1;
import java.util.Scanner;
public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
	    String scanned=x.next();
	    if(scanned.equals("sreyaa")) {
	    	System.out.println("your name is sreyaa");
	    }
	    System.out.println("your typed your name");
	  //if else statement
	    Scanner y=new Scanner(System.in);
	    int scanner=y.nextInt();
	    if(scanned.equals("sreyaa") && scanner==18){
	    	System.out.println("you are 18 years old sreyaa");
	    }else {
	    	System.out.println("sry you r nott 18 years olddd");
	    }
	    //else if statement
	    Scanner z=new Scanner(System.in);
	    int scann=z.nextInt();
	    if(scann<=45) {
	    	System.out.println("you r slimm");
	    }
	    else if(scann<=55 && scann>45) {
	    	System.out.println("u r meddd");
	    }
	    else {
	    	System.out.println("u r kindaa hvyyy");
	    	
	    }
	}

}

         
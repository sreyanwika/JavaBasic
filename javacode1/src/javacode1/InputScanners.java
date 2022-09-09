package javacode1;
import java.util.Scanner;

public class InputScanners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input for string
      Scanner x=new Scanner(System.in);
      String scanned=x.next();
      // int c=Integer.parseInt(scanned); used to convert string in to integer      
      System.out.println(scanned);
      //user input for integer
      Scanner y=new Scanner(System.in);
      int age=y.nextInt();
      System.out.println(age);
      System.out.println("is her age is rytt??");
      //boolean data type
      Scanner z=new Scanner(System.in);
      boolean answr =z.nextBoolean();
      System.out.println(answr);
      //double data type
      Scanner a=new Scanner(System.in);
      double num=a.nextDouble();
      System.out.println(num);
	}

}

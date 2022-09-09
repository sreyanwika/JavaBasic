package javacode1;
import java.util.Scanner;
public class CondtionsBooleans {
	public static void main(String[] args) {
		 Scanner y=new Scanner(System.in);
	      int age=y.nextInt();
	      System.out.println(age);
	      Scanner x=new Scanner(System.in);
	      int age1=x.nextInt();
	      System.out.println(age1);
	      Scanner z=new Scanner(System.in);
	      int age2=z.nextInt();
	      System.out.println(age2);
	      //conditional statements > < >= <= == !=...
	      boolean b=age1>age2;
	      //and or not
	      boolean a=age<age1 && age>age2;
	      boolean c=!(age>age2 || age2<age1);
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);

	      String d="sreyaa";
	      String e="Seya";
	      boolean f=d==e;
	      System.out.println(f);
}
}

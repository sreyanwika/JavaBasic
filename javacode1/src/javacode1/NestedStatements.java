package javacode1;
import java.util.Scanner;
public class NestedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your fav place:");
		Scanner x=new Scanner(System.in);
		String place=x.nextLine();
		if(place.equals("newyork")) {
			System.out.println("u shld tke visa n travel to usa");
			//nested loop
			System.out.println("enter your fav author:");
			String auth=x.nextLine();
			if(auth.equals("nicolaus")) {
				System.out.println("i love hiss romantic novels");
			}
		}
		else if(place.equals("bangkok")) {
			System.out.println("u shld tke visa n travel to thailand");
			//nested loop
			System.out.println("enter your fav actor:");
			String actor=x.nextLine();
			if(actor.equals("bright")) {
				System.out.println("i love hiss comb with win");
			}
		}
		else if(place.equals("nayagra falls")) {
			System.out.println("u shld tke visa n travel to usa r cannada");
		}
		else {
			System.out.println("pls find mapss...");
		}
		//conversion of string into integer...
				System.out.println("enter the area:");
				String width=x.nextLine();
				int area=Integer.parseInt(width);
				System.out.println(area);
	}
}
	


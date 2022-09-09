package javacode1;
import java.util.Scanner;
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reading an string array through user input
		Scanner x=new Scanner(System.in);
		String[] names= new String[5];
		for(int i=0;i<=names.length-1;i++) {
			System.out.println("enter d nme of hero:");
			String hero=x.nextLine();
			names[i]=hero;
		}
		//for each method for strings
		for(String elements:names) {
			System.out.println(elements);
		}
		//for each method for strings using break
		for(String elements:names) {
			System.out.println(elements);
			if(elements.equals("brightwin")) {
				System.out.println("u finally found brightwin");
				break;
			}
		}
		//for each method for integers
		
    int arr[]= {23,29,25,66,88};
    int count=0;
    for(int element: arr) {
    	System.out.println(element+"   "+count);
    	count++;
    }
	}

}

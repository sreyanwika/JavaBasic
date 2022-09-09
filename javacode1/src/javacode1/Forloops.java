package javacode1;
import java.util.Scanner;
public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop through user input
	Scanner x=new Scanner(System.in);
		int y=x.nextInt();
		for(int s=1;s<=y;s+=5) {
			System.out.println("the numbers after incrementing r"+s);
		}
		//for loop for strings
		String[] arr= {"s","r","e","y","a"};
		for(int b=0;b<=arr.length-1;b++) {
			System.out.println(arr[b]);
		}
		String[] arr1= {"s","r","e","y","a","n","w","i","k","a"};
		int count=0;
		for(int b=0;b<=arr1.length-1;b++) {
			if(arr1[b]=="a") {
			count++;
			System.out.println("the num of tyms a occ r "+b+count);
		}
		}
		
		
    for(int i=0;i<=5;i++) {
    	System.out.println(i);
    }
	}
}

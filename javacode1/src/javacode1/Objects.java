package javacode1;
import java.util.Scanner;
public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);//scanner class ,x object..
		//int y=x.nextInt();//.next...method
		String nme="poorvi sreyaa";// string data type/class nme..is an object..poorvi sreya is a value
		nme.length();//,length method
		//nme.next()(throws bcz method is not correct)
		frnds("poorvithasreyaaa",6);//porvi sreya and 6 are arguments...this calling methodd
		System.out.println(num(10));
		num(15);//return statements only returns d values while call tm..for datt v hve to use print statement
		System.out.println(name("hareyaan"));
	}
	
	public static  void frnds(String name,int x) { //nme and x are parameters
		for(int i=0;i<=x;i++) {
			
			System.out.println(name);	
		}
		
	}
	public static int num(int l) {
		return l/5;
		
	}
	public static String name(String naam ) {
		return naam+"choo swett";
		
	}
}

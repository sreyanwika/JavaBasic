package javacode1;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] ele=new int[4];
    ele[0]=1;
    ele[1]=8;
    ele[2]=9;
    ele[3]=5;
    int nums=ele[3];
    System.out.println(nums);
    //direct installing with out declaring the size
    String[] nmes= {"sreya","joo","vee","hiii","hmm"};
    String x=nmes[4];
    System.out.println(x);

    
	}
// sorting arrays it will sort the elements in order
	public static void sort(int[] aray, int i, int j) {
		// TODO Auto-generated method stub
		int[] aray1= {-77,4,5,6,9};
	    Arrays.sort( aray1,1,3);
	    for(int x:aray1) {
	    	System.out.print(x+",");
	    	
	    }
	}

}

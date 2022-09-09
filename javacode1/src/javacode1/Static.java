package javacode1;

public class Static {
	//output in main
	protected static int count=0;
	private String name;
	public Static(String name) {
    	this.name= name;
    	count+=1;
    	Static.print();
    	this.print();
    	//Static.print2();(wont work because static  wont search for an instance)
    	this.print2();//(works bcz this search for an instance )
    	    }
	public void print2() {//instance
		System.out.println("i m no1 veggy!!");
		
	}
	public static void print() {
		System.out.println("i am a veggyyyyy!!");
	}

}

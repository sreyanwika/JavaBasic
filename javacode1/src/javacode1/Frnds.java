package javacode1;

public class Frnds {//classes
	private String name;
	private int age=18;
	private String clg;
	 public Frnds(String name,String clg) {
	    	this.name= name;
	    	this.clg= clg;
	    	    }
	    public void run() {
	    	System.out.println("i am "+this.name+" i am "+this.age+" years old"+" studying in "+ this.clg +"the age after inc"+" "+add2(this.age));
	    }
    public int Age() {
    	return this.age;
    }
    public void Set(String name) {
    	this.name= name;
    }
    //public method of addition
    public  int add() {
    	return this.age+2;
    }
    //private method
    private  int add2(int age) {
    	return this.age+6;
    }
        public static void main(String[] args) {
        	//creating an object of type class Frnds
    	  Frnds x=new Frnds("shre","pu clg");
    	   x.run();
    	
    	
    }
}
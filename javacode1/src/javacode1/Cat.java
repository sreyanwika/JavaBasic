package javacode1;

public class Cat {
	protected String name;
	protected int age;
    public 	Cat(String name,int age) {
    	this.name= name;
    	this.age= age;
    	
    	
    }
    public void run() {
    	System.out.println("i am "+this.name+" i am "+this.age+" years old");
    }
}

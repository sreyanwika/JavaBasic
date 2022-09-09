package javacode1;
//inheritance

public class Fish extends Cat{
    private String color;
	public Fish(String name, int age,String color) {
		super(name, age);//keyword that creates superclass constructor
	    this.color= color;
	    eat(age);
	}
	//output is in main.java
	public Fish(String name, int age) {
		super(name, age);
	    this.color= "grey";
	}
	public Fish(String name) {
		super(name, 0);//we have to keep zero bcz in class of cat age is mentioned  
	    this.color= "grey";
	    
	}
	public void run() {
		System.out.println("by the way this is"+this.name+"present"+this.age+"years old"+"i look in"+this.color+"color"+"eats"+eat(age));
	}
    public int eat(int age) {
    	//or we can write return age-=x;
		return age-=1;
    	
    }
}

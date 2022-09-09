package javacode1;
//inner classes
public class Outerclass {
	private class Innerclass{
		public void display() {
			System.out.println("ok lets just say i am standing here yukthiiii");
		}
	}
	public void in() {
		Innerclass var=new Innerclass();
		var.display();
	}
   public void inner() {
	   class Inside{//the reason why we didnt mention public or private because it is already inside the void to run first we go through the void 
		   private String name;
		public Inside(String name) {
			   this.name=name;
		   }
		   public void print() {
			   System.out.println("ok then waitt i will be there soon!!"+this.name);
		   }
	   }
	   Inside y=new Inside("sriyansh");
	   y.print();
   }
   
}

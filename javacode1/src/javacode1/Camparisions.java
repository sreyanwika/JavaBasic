package javacode1;

public class Camparisions implements Comparable<Camparisions>{
	private String intern;
	private int marks;
	private char grade;
	public Camparisions(String intern,int marks,char grade) {
    	this.intern= intern;
    	this.marks= marks;
    	this.grade= grade;
    	
	}
	public Camparisions(int marks) {
    	this.marks= marks;
	}
	public String equals(Camparisions other){
		if(((this.intern)==(other.intern) & (this.marks)==(other.marks))) {
			return "marks as well as name are also same";
		}
		else if(((this.intern)==(other.intern) & (this.marks)!=(other.marks))){
			return "names are equal";
			
		}
		else if((this.marks)==(other.marks)){
			return "marks are same";
			
		}
		else {
			return "nothing is equal";
		}
	}
	public boolean check(Camparisions other){
		if(this.marks==other.marks) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public int compare(Camparisions other) {
		return this.intern.compareTo(other.intern);
		
	}
	//creating string to print..
	public String pro() {
		return "tech("+this.intern+")";
		
	}
	public String Grade() {
		return "grade:"+this.grade;
		
	}
	@Override
	public int compareTo(Camparisions o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

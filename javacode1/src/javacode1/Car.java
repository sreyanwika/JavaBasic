package javacode1;

public class Car implements Vehicle {
	private int gear=1;
	private int speed=0;
	private String name;
	public void name(String cars) {
		this.name=cars;
		
	}

	public void changeGear(int gear1) {
	    this.gear=gear1;
		
	}
	public void speedUp(int fast) {
	    this.speed+=fast;
		
	}
	public void slowDown(int slow) {
	    this.speed-=slow;
		
	}
	public void output() {
		System.out.println("i am"+this.name+"i am at"+this.gear+"gear"+"now i m going @ speed"+this.speed+"km/hr");
	    run();
	   Vehicle.magic(12);
	}
}

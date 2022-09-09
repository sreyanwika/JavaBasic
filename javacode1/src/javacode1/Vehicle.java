package javacode1;
//interfaces

public interface Vehicle {
	final int gears=5;
	void changeGear(int a);
	void speedUp(int a);
	void slowDown(int a);
	default void run() {
		System.out.println("heyaaaa");
	}
	static int magic(int a) {
		return a/2;
	}

}

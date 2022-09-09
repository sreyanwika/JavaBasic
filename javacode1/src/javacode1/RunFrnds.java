package javacode1;

public class RunFrnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Frnds sreya=new Frnds("sreya","pu clg");
     sreya.run();
     Frnds harshini=new Frnds("harshini","amrita clg");
     harshini.run();
     Frnds afreen=new Frnds("afreen","pu clg");
     afreen.run();
     Frnds poorvitha=new Frnds("poorvitha","iit clg");
     poorvitha.run();
     Frnds sanju=new Frnds("sanju","junior clg cmpltd");
     sanju.run();
     Cat mimi=new Cat("mimi",4);
     mimi.run();
     Cat meow=new Cat("meow",7);
     meow.run();
     Cat mikuu=new Cat("mikuu",2);
     mikuu.run();
     int s=sreya.Age();
     System.out.println(s);
     sanju.Set("sanjana");
     sanju.run();
     sreya.add();
     System.out.println(sreya.add());
     //sreya.add2(); it wont run because it is private class
	}
   
}

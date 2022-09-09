package javacode1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("heloooo sreyaaa");
     Fish marine=new Fish("marine",13,"blue");
     marine.run();
     Fish mesh=new Fish("mesh");
     mesh.run();
     Fish mallo=new Fish("mallo",11,"canayon");
     mallo.run();
     Fish ginni=new Fish("ginni",14);
     ginni.run();
     Fish craw=new Fish("craw",13,"gold");
     craw.run();
     //static
     Static lime  =new Static("lime");
     Static brinjal  =new Static("brinjal");
     Static bendi  =new Static("bendi");
     Static dondi  =new Static("dondi");
     Static caly  =new Static("caly");
     //Static.count=7;(print it removing comments to know how it works)
     System.out.println(Static.count);
     //comparison
     Camparisions sreya  =new Camparisions("Sreya",19,'o');
     Camparisions noa  =new Camparisions("Sreya",21,'c');
     Camparisions arjun  =new Camparisions("Arjun",17,'d');
     Camparisions nion  =new Camparisions("Nion",16,'a');
     //comparing strings
     System.out.println(sreya.compare(arjun));
     //checking whether equal or not
     System.out.println(sreya.equals(noa));
     Camparisions sujuki  =new Camparisions(1);
     Camparisions haidi  =new Camparisions(1);
     System.out.println(sujuki.check(haidi));
     //printing strings
     System.out.println(sreya);
     System.out.println(sreya.pro());
   //comparing strings
     System.out.println(sreya.compare(arjun));
     System.out.println(arjun.compare(sreya));
     System.out.println(sreya.compareTo(arjun)<0);
     System.out.println(arjun.compare(sreya)<0);
    //printing grades
     System.out.println(nion.Grade());
	//inner classes
     Outerclass out=new  Outerclass();
     out.in();
    // Outerclass out1=new  Outerclass();
    // Outerclass.Innerclass cr=out1.new Innerclass();
   //  cr.display() this method runs when the innerclass is public
     Outerclass out2=new  Outerclass();
     out2.inner();
    //interfaces
     Car fiat=new Car();
     fiat.name("fiat");
     fiat.speedUp(50);
     fiat.changeGear(3);
     fiat.output();
     System.out.println(Vehicle.magic(12));
     int num=Vehicle.magic(12);
     System.out.println(num);
     //enums
     Range x= Range.midfast;
     x.set(100);
     System.out.println(x.get());
     System.out.println(x.valueOf("midslow"));
	 
     Range[] arr=Range.values();
     for(Range xl:arr) {
    	 System.out.println(xl);
    	 
     }
     if (x==Range.fast) {
    	System.out.println(x);
     
     }
     else if(x==Range.slow){
    	 System.out.println(x);
    	     }
     else if(x==Range.medium){
     	System.out.println(x);
     	     }
     else if(x==Range.midslow){
     	System.out.println(x);
     	     }
     else {
    	 System.out.println(x);
	}    		 
	}
}


public class Test
{
	public static void main(String[] args){
		String s = new String("WhatsApp");
		Thread t = new Thread();
		Exception e = new Exception();
		StringBuffer sb = new StringBuffer();
		Customer c = new Customer();
		Customer.m1();
		
		System.out.println("Class B successfully");
	}
	
}

whatsapp

Test			Test2

Abstract modifier
1)
a) its applicable for methods
b) its applicable for class 
c) its not applicable for variable

Abstract which is clear / partially completed.

Abstract methods
public class Vehicle

number of wheel
public int nov() //car 4
						// bus 8 /6
						
animal (abstract)
dog cat

vegetable(abstract)
	tasteofveg(abstract)
	
	
	interface declaration & implementation
	
	interface inf{
		
		public void m1;
		public void m2;
		
	}
	
	class is responsible
	
	class serviceprovider implements inf{
		void m2; // public void m2;
		{
		}
		// not override for m1
	}
	
	types of inheritance
	
	a) single inheritance
	class A extends class B
	
	ex: class date class time (current time)
	
	B-parent
	A child
	
	
	b) multiple inheritance
	Class A (p)		Class B(p)
	
			Class C
			
	class C extends Class A
	class C extends Class B 
	
	ex: class district extends class state,  
	class state extends country

c) multi level inheritane

Class A(p)

Class B extends class A

Class C extends class B

class Students extends Classroom
class classroom extends standard
class standard extends school

	
	
	
	
	
	
	v
						
since we dont know the clear implementation we use abstract methods


// overloading program

class Test{
	public void m1()
	{
		System.out.println("no-argument");
	}
	public void m1(int i)
	{
		System.out.println("integer type");
		
	}
	public void m1(double d)
	{
		System.out.println("double argument");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(12.5);
	}
}	

Output:
no-argument
integer type
double argument


// Overloading can be represent as Compile time polymorphism / Early binding / Static polymorphism
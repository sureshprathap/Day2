// Case study 4 of overloading  Generic and value argument

class Test6{
	public void m1(int i) //Generic method jdk1.5
	{
		System.out.println("Generic method ");
	}
	public void m1(int... i)
	{
		System.out.println("Other int value argument");
	}
	public static void main(String[] args){
		Test6 t = new Test6();
		t.m1(10); //generic
		t.m1(10,20); // other value
	}
}	

Output:
Generic method 
Other int value argument



//m1(10)
//m1(int ... i)

//generic method
//value method 

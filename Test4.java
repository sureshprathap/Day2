// Case study 2 of overloading 

class Test4{
	public void m1(Object o)
	{
		System.out.println("Object type");
	}
	public void m1(String s)
	{
		System.out.println("String argument");
	}
	public static void main(String[] args){
		Test4 t = new Test4();
		t.m1(new Object()); //Object version
		t.m1("Classroom"); // String Version
		t.m1(null); //null
	}
}	

Output:

Object type
String argument
String argument


//String child class of Object
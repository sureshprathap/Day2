// Case study 3 of overloading : compare String with StringBuffer with null value

class Test5{
	public void m1(String s)
	{
		System.out.println("String argument");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer argument");
	}
	public static void main(String[] args){
		Test5 t = new Test5();
		t.m1("Classroom");  // String version
		t.m1(new StringBuffer("Classroom2"));  // StringBuffer version
		//t.m1(null);
	}
}	

Output:

String argument
StringBuffer argument


//String child class of Object
//StringBuffer child class of Object
/*javac Test5.java
Test5.java:16: error: reference to m1 is ambiguous
		t.m1(null);
		 ^
  both method m1(String) in Test5 and method m1(StringBuffer) in Test5 match
1 error
*/

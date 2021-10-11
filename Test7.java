// Case study 5 of overloading  

class Test7{
	public void m1(int i, float f) 
	{
		System.out.println("int-float method ");
	}
	public void m1(float f, int i)
	{
		System.out.println("float-int argument");
	}
	public static void main(String[] args){
		Test7 t = new Test7();
		t.m1(10, 12.5f); // int - float version
		t.m1(12.5f,10);  // float - int version
		/*t.m1(10);	//ambigous
		t.m1(20,10);	//ambigous*/
	}
}	


Output:
float-int argument


/*
est7.java:16: error: no suitable method found for m1(int)
		t.m1(20);
		 ^
    method Test7.m1(int,float) is not applicable
      (actual and formal argument lists differ in length)
    method Test7.m1(float,int) is not applicable
      (actual and formal argument lists differ in length)
1 error


Test7.java:16: error: reference to m1 is ambiguous
		t.m1(20,10);
		 ^
  both method m1(int,float) in Test7 and method m1(float,int) in Test7 match
1 error


*/
// Case study 1 of overloading --- automatic promotion

class Test3{
	public void m1(int i)
	{
		System.out.println("integer type");
	}
	public void m1(float f)
	{
		System.out.println("double argument");
	}
	public static void main(String[] args){
		Test3 t = new Test3();
		t.m1(10);  //display by int overloading method
		t.m1(12.5f); //display by float overloading method
		t.m1('a'); // display version will be int
		t.m1(25L); // display version will be float
	}
}	

Output:
integer type
double argument
integer type
double argument


//while perform overloading it will search exact match first
// but if overloading method not declared it promote next type
//automatic promotion

//chart
//byte->short->int->long->float->double
//char->int
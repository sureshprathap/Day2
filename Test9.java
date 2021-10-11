//Method Overriding - child can able override the parent


class Principal
{
	public void seatAvailibility()
	{
		System.out.println("Admission+classroom+section");
	}
	public void admit()
	{
		System.out.println("Student details");
	}
}

class Admin extends Principal{
	public void admit()
	{
		System.out.println("Student: Ashok");
	}

}

public class Test9
{
	public static void main(String[] args){
		Principal p = new Principal();
		p.admit(); //
	}
}

//Output;
//Student details

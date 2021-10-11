// Case study 6 of overloading  - compile polymorphism or static or early binding 

class Animal{
	
}

class Dog extends Animal{
	
}
	
class Test8{

		public void m1(Animal a)
		{
				System.out.println("Animal version");
		}
		public void m1(Dog d)
		{
				System.out.println("Dog version");
		}
		
		public static void main(String[] args){
		Test8 t= new Test8();
		Animal a = new Animal(); // animal version'
		t.m1(a);
		Dog d = new Dog();   // Dog version
		t.m1(d);
		Animal a1 = new Dog();
		t.m1(a1); // animal version
		}
	}
	
//in overloading consider method carry in compile polymorphism or static or early binding

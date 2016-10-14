package mypackage;

public class Sample {

	public static void main(String args[]){
	B b=(B) new A();
		System.out.println(a.sum(10));
	}
	
	
}


class A{
	
	public long sum(long a){
		System.out.println("inside a");
		return a;
	}
}


class B extends A{
	
	public long sum(long a){
		System.out.println("inside b");
		return a;
	}
}

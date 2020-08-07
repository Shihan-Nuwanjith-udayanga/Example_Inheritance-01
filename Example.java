class A{
	int a;
	A(){
		System.out.println("A() ");
	}
	A(int i){
		System.out.println("A(int) ");
	}
	A(int i, int j){
		System.out.println("A(int,int) ");
	}
	public void printA(){
		System.out.println("A : "+a);
	}
}
class B extends A{
	int b;
	B(){
		super();
		System.out.println("B() ");
	}
	B(int i){
		super(i);
		System.out.println("B(int) ");
	}
	B(int i, int j){
		super(i,j);
		System.out.println("B(int,int) ");
	}	
	public void printB(){
		System.out.println("B : "+b);	
	}
}

class Example{
	public static void main(String args[]){
		B b1=new B(); 
		System.out.println("--------------");
		B b2=new B(100); 
		System.out.println("--------------");
		B b3=new B(100,200);
	}
}

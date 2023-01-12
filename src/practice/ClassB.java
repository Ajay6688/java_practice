package practice;

public class ClassB {
	
	void meth1()
	{
		
	System.out.println(10); 
	System.out.println(64);

	System.out.println("End");
	}
	

	int meth2 (int a, int b, int c)//50
	{
	System.out.println(a);
	ClassB bobj=new ClassB(); 
	String s =bobj.meth5(100,"Java is awesome");

	System.out.println(s);
	return a-b;
	}

	String meth3(String s, int b, int d)
	{
	System.out.println(b+d);

	return s;
	}

	int meth4(int c, int k) //c=20,k=10
	{
	System.out.println(k); 
	ClassB bobj=new ClassB(); 
	int result=bobj.meth2(50, 50, 50); 
	System.out.println(result);

	return k+10;
	}
	String meth5(int a, String L)
	{
	System.out.println(a+a); 
	ClassB bobj=new ClassB(); 
	String s =bobj.meth3("Hi", 15, 10);

	System.out.println(s); 
	return L;
	}
	public static void main(String[] args) {

	ClassB bobj=new ClassB();
	System.out.println("START");
	int result=bobj.meth4(20, 10);
	System.out.println(result);
	bobj.meth1();
	}

}

package Unit_01;
/*
# piece of data/code that would never change
# constants never change once value is assigned
*/
public class P2_Task02_ConstantsInJava {
	public static final double Pi=3.14;
	//Pi=3.18
	public static void main(String[] args) {
		System.out.println(Pi);
		main("acsffgdfbd");
		NewClass obj=new NewClass();
		obj.add(1,2);
		System.out.println(obj.Pi);
	}
	public static void main(String args) {
		System.out.println(Pi);
	}	
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(Pi);
	}
}
class NewClass{
	//final double Pi=3.14;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(P2_Task02_ConstantsInJava.Pi);
	}
}
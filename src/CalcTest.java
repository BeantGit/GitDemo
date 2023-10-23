class MyCalc
{
	// this class added for git test by Aman.
	int add(int a, int b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
	int mul(int a, int b)
	{
		return a-b;
	}
}
public class CalcTest {
	
	public static void main(String[] args) {
		
		System.out.println("My Calculator test by Aman");
		MyCalc c = new MyCalc();
		System.out.println("Sum = "+c.add(10, 20));
	}

}

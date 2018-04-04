class FibonacciWhileLoopRev
{
public static void main(String... args)
{
	int a=89,b=55,c;
	System.out.println(a);
	System.out.println(b);
	c=a-b;
	System.out.println(c);
	
	while(c>=89)
	{
		a=b;
		b=c;
		c=a-b;
		
		System.out.println(c);
	}
	

}
}
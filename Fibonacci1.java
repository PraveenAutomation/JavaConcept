class Fibonacci1
{
public static void main(String... args)
{
	int a=0,b=1,c;
	System.out.println(a);
	System.out.println(b);
	
	c=a+b;
	System.out.println(c);
	
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);
	
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);//0 1 1 2 3 5
	
}
}
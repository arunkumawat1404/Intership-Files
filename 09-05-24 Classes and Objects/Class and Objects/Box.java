public class Box
{
	double width, height, depth;
 
	Box()
	{
		width = 1;
		height = 1;
		depth = 1;
	}
 
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
 
	void myMethod()
	{
		System.out.println("Width : " + width);
		System.out.println("Height : " + height);
		System.out.println("Depth : " + depth);
	}
 
	public static void main(String[] args)
	{
		Box box1 = new Box();
		Box box2 = new Box(3, 8, 6);
		box1.myMethod();
		box2.myMethod();
 
	}
}

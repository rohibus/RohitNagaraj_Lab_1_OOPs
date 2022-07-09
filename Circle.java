public class Circle extends Shape
{
	double radius;
	final double PI = 3.142;

	public Circle(double radius, String color)
	{
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea()
	{
		return PI * radius * radius;
	}

	@Override
	public double calculatePerimeter()
	{
		return 2 * PI * radius;
	}

	@Override
	public void display()
	{
		System.out.println("this is a Circle shape with color " + super.color);
	}
}
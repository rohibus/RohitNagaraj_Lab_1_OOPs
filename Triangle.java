public class Triangle extends Shape
{
	double height, base;

	public Triangle(double base, double height, String color)
	{
		super(color);
		this.height = height;
		this.base = base;
	}

	@Override
	public double calculateArea()
	{
		return (1.0/2) * base * height;
	}

	@Override
	public double calculatePerimeter()
	{
		double base1 = (1/2)*base;
		return 2*Math.sqrt((height*height) + (base1*base1)) + base;
	}

	@Override
	public void display()
	{
		System.out.println("this is a Triangle shape with color " + color);
	}
}
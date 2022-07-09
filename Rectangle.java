public class Rectangle extends Shape
{
	double height, width;

	public Rectangle(double width, double height, String color)
	{
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea()
	{
		return width * height;
	}

	@Override
	public double calculatePerimeter()
	{
		return 2 * (width + height);
	}

	@Override
	public void display()
	{
		System.out.println("this is a Rectangle shape with color " + color);
	}
}
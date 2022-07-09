public class Square extends Rectangle
{

	public Square(double side, String color)
	{
		super(side, side, color);
	}

	@Override
	public void display()
	{
		System.out.println("this is a Square shape with color " + super.color);
	}
}
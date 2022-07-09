public class Main
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(4, "Red");
		circle.display();
		System.out.println("Area = " + circle.calculateArea());
		System.out.println("Perimeter = " + circle.calculatePerimeter());

		Square square = new Square(4, "Red");
		square.display();
		System.out.println("Area = " + square.calculateArea());
		System.out.println("Perimeter = " + square.calculatePerimeter());


		Triangle triangle = new Triangle(4, 10, "Red");
		triangle.display();
		System.out.println("Area = " + triangle.calculateArea());
		System.out.println("Perimeter = " + triangle.calculatePerimeter());

		Rectangle rectangle = new Rectangle(4, 10, "Red");
		rectangle.display();
		System.out.println("Area = " + rectangle.calculateArea());
		System.out.println("Perimeter = " + rectangle.calculatePerimeter());

	}
}

public class Rectangle {

	// data members
	private double length;
	private double width;
	
	
	public Rectangle(double len, double wid)
	{
		length = len;
		width = wid;
	}
	
	public Rectangle(double len)
	{
		length = len;
		width = 0;
	}
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
		
	public void set(double newLength, double newWidth)
	{
		length = newLength;
		width = newWidth;
	}
		
	
	// methods
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double calculateArea()
	{
		double area = length * width;
		return area;
	}
	
	public String toString()
	{
		return (length + " x " + width);
	}
	
	public boolean equals(Rectangle otherRectangle)
	{
		return (length == otherRectangle.length) && (width == otherRectangle.width);
	}
	
}
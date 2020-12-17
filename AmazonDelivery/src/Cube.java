
public class Cube extends Rectangle {

	 private double height;
	 
	 public Cube(double length, double width, double theHeight)
	 {
	     super(length, width);
	     height = 0.0;
	 }

	 public Cube()
	 {
	     super( );
	     height = 0.0;
	 }

	 public double getHeight()
	 {
	     return height;
	 }

	 public void set(double newLength, double newWidth, double newHeight)
	 {
		 super.set(newLength, newWidth);
		 height = newHeight;
	
	 }
	 
	 public String toString()
	 {
		 return (super.toString() + " x " + height);
	 }
	 
	 public boolean equals(Cube otherCube) 
	 {
		 return (super.equals(otherCube) && (height == (otherCube.height)));
	 }
	 
	 public double calculateVolume()
	 {
		 double volume = super.calculateArea() * height;
		 return volume;
	 }
	 
}

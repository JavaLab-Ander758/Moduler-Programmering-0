public class Listing09_01TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a cirle with radius 1
		Circle circle1 = new Circle();
		System.out.printf("The area of the circle of radius %.1f is %s \n", circle1.radius, circle1.getArea() );
		
		// Create a cirle with radius 25
		Circle circle2 = new Circle(25);
		System.out.printf("The area of the circle of radius %.1f is %s \n", circle2.radius, circle2.getArea() );
		
		// Create a cirle with radius 125
		Circle circle3 = new Circle(125);
		System.out.printf("The area of the circle of radius %.1f is %s \n", circle3.radius, circle3.getArea() );
		
		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100);
		System.out.printf("The area of the circle of radius %.1f is %s \n", circle2.radius, circle2.getArea() );
	}
}

//Defice the circle class with two constructors
	class Circle {
		double radius;
		
		/** Construct a circle with radius 1 */
		Circle() {
			radius = 1;
		}
		
		/** Construct a circle with a specified radius */
		Circle(double newRadius){
			radius = newRadius;
		}
		
		/** Return the area of the circle */
		double getArea() {
			return radius * radius * Math.PI;
		}
		
		//* Return the perimeter of this circle */
		double getPerimeter() {
			return 2 * radius * Math.PI;
		}
		
		/** Set a new radius for this circle */
		void setRadius(double newRadius) {
			radius = newRadius;
		}
	}
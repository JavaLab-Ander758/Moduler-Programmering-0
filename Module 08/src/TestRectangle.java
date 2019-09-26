
public class TestRectangle {

	public static void main(String[] args) {
		
		MyRectangle rectangle1 = new MyRectangle(4, 40);
		System.out.printf("Rektangel med sider: %.2f og %.2f \n", rectangle1.getWidth(), rectangle1.getHeight());
		System.out.printf("Har areaket lik:\t%.2f \n", rectangle1.getArea());
		System.out.printf("Og omkretsen lik:\t%.2f \n", rectangle1.getPerimeter());
		
		MyRectangle rectangle2 = new MyRectangle();
		rectangle2.setWidth(6.30);
		rectangle2.setHeight(5.40);
		System.out.printf("\nHar areaket lik:\t%.2f \n", rectangle2.getArea());
		System.out.printf("Og omkretsen lik:\t%.2f \n", rectangle2.getPerimeter());
	}

}

class MyRectangle {
	private double width = 1, height = 1;
	
	// Sett width og height dersom ingen initialisering
	public MyRectangle() {
		width = 1;
		height = 1;
	}
	
	public MyRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

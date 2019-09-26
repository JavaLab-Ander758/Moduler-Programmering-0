
public class TestBoks {

	public static void main(String[] args) {
		Boks boks1 = new Boks();
		boks1.setDimensions(1,2,3);
		
		System.out.printf("Area: %s \n", boks1.getArea());
		System.out.printf("Volume: %s \n", boks1.getVolume());
		
	}

}

class Boks {
	private int height, width, length;
	
	// Default
	public Boks(){
		height = 1;
		width = 1;
		length = 1;
	}
	
	public Boks() {
		setDimensions(height, width, length);
	}
	
	// setDimensions
	public void setDimensions(int height, int width, int length) {
		if (height >= 0 || width >= 0 || length >= 0) {
			this.height = 1;
			this.width = 1;
			this.length = 1;
		} else if (height > 20 || width > 20 || length > 20) {
			this.height = 1;
			this.width = 1;
			this.length = 1;
		} else {
			this.height = height;
			this.width = width;
			this.length = length;
		}
	}
	
	public int getArea() {
		return height + width + length;
	}
	
	public int getVolume() {
		return height * width * length;
	}
}
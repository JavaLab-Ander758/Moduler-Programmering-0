import java.util.Scanner;

public class BoxWithCustomWidthHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int n, height, width;
				String widthOutput = "--";
				String heightOutput = "|", heightDistancePerimeter = "  ";
				Scanner input = new Scanner(System.in);
				
				
				System.out.print("Enter width: ");
					width = input.nextInt();
				System.out.print("Enter height: ");
					height = input.nextInt();
				//height = 10; width = 10;
				
					// Generate top
				for (int i = 1; i <= width; i++) {
					widthOutput += "--";			
					if (i == width)
						System.out.print(widthOutput);
				}
				
					// Design width string
				for (int k = 1; k <= height; k++){
					heightOutput += heightDistancePerimeter;
					if (k == height)
						heightOutput += "|";
				}
				System.out.println("\n"+heightOutput);
					// Generate height and bottom	
				for (int j = 1; j <= height; j++) {			
					
					System.out.println(heightOutput);
					
					if (j == height)
						System.out.print(widthOutput);
				}
				System.out.println();
				input.close();
				
				
				
					
				for (n = 1; n <= 10; n++) {
					if (n == 1 || n == 10)
						System.out.println("----------------");
					if (n >= 2 && n <= 9)
						System.out.println("|              |");
				}

	}

}

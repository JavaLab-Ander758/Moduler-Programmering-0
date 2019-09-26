import java.util.Calendar;

public class TestingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date[] dates = new java.util.Date[10];
		
		for (int i = 0; i < dates.length; i++)
			System.out.printf("dates[%d] = %s \n", i, dates[i]);
		
		System.out.printf("\ndates[0] = %s \n\n", dates[0]);
		
		dates = new java.util.Date[5];
		for (int i = 0; i < dates.length; i++)
			System.out.printf("new dates[%d] = %.0f \n", dates[i]);
		
		//dates = new Date();
	}
}


public class BeregnPi {

	public static void main(String[] args) {
		// Beregner Pi, blir mere nøyaktig når vi øker leddene
			
		System.out.println("Pi eeeeeer cirka:");
		System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/15 + 1.0/17 - 1.0/19));

	//tester med double variabel for siffer med komma
		double divizer;
			divizer = 1.0;
		double accuratePi;
			accuratePi = (4 * (divizer - divizer/3 + divizer/5 - divizer/7 + divizer/9 - divizer/11 + divizer/13 - divizer/15 + divizer/17 - divizer/19));
		System.out.println("Pi eeeeeer cirka:" + accuratePi);
	}

}

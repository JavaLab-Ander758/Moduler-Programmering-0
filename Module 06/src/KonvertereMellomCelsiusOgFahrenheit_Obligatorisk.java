public class KonvertereMellomCelsiusOgFahrenheit_Obligatorisk {

	public static void main(String[] args) {
		// Lag en tabell som indikerer verdier for celsius fra 40-31(-1 pr.step) og verdier for fahrenheit fra 120-30(-10 pr.step)
		String c = "Celsius", f = "Fahrenheit";
		System.out.printf("%s\t\t%s\t%s\t%s\t%s \n", c, f, "|", f, c);
		
		// Lager øverste linje for tabellen
		for (int x = 0; x < 63; x++)
			System.out.print("_");
		System.out.print("\n");
		
		double initialF, secondC;
		for (int i = 40, n = 120; i >= 31; i--, n -= 10) {
			initialF = celsiusToFahrenheit(i);
			secondC = fahrenheitToCelsius(n);
			// Print ut gjeldende celsius og fahrenheit for hver loop
			System.out.printf("%s\t\t%.1f\t\t%s\t%s\t\t%.2f \n", i, initialF, "|", n, secondC);
		}
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
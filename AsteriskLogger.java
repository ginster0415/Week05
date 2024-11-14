package Week05;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log (String a) {
		System.out.println("***" + a + "***");
	}
	
	@Override
	public void error (String b) {
		int count1 = 0;
		int count2 = 0;
		while (count1 < (b.length() + 13)) {
			System.out.print("*");
			count1++;
		}
		System.out.println("\n***Error: " + b + "***");
		while (count2 < (b.length() + 13)) {
			System.out.print("*");
			count2++;
		}
	}

}

package Week05;

public class SpacedLogger implements Logger {

	
	
	@Override
	public void log (String a) {
		System.out.println("\n");
		char[] word1 = a.toCharArray();
		for (int i = 0; i < word1.length; i++) {
			System.out.print(word1[i] + " ");
		}
		
	}
	
	@Override
	public void error (String b) {
		System.out.print("\nError: ");
		char[] word2 = b.toCharArray();
		for (int i = 0; i < word2.length; i++) {
			System.out.print(word2[i] + " ");
		}
	}

}

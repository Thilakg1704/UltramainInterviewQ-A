package DemoProjects.Ultramain;

import java.util.Scanner;

public class PossibleThreeDigitValues {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer Type Number:\nTo find the possible 3 digit values");
		int input =scan.nextInt();
		String inputString = String.valueOf(input);
		for(int i=0;i<inputString.length();i++) {
			for(int j=0;j<inputString.length();j++) {
				for(int k=0;k<inputString.length();k++) {
					if(i != j && j != k && i != k) {
					System.out.print((" " + inputString.charAt(i) + inputString.charAt(j) + inputString.charAt(k)+","));
						
					}
				}
			}
		}
	}

}

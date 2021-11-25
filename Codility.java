package Week04HomeWork;

/**
* This is the home work test done by Merfu, looks very good.
*/

public class CodilityTester {

	public static void main(String[] args) {

		String str1 = "Codility";
		String str2 = "Test";
		String str3 = "Coder";

		String output = " ";
		for (int i = 1; i < 31; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				output = str1 + str2 + str3;
			}
			if (i % 2 == 0 && i % 3 == 0) {
				output = str1 + str2;
			}
			if (i % 3 == 0 && i % 5 == 0)

			{
				output = str2 + str3;
			}
			if (i % 3 == 0) {
				output = str2;
			}
			if (i % 5 == 0) {
				output = str3;
			}
			if (i % 2 == 0) {
				output = str1;
			}
			if (output != " ") {
				System.out.println(output);
			} else {
				System.out.println(i);
			}
		}

	}

}

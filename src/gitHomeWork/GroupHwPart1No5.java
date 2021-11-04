package gitHomeWork;

public class GroupHwPart1No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = { { "Iraq   ", "   Canada      ", "USA      ", "   Italy", "Morroco" },
				{ "Baghdad", "Ottawo", "Washington DC", " Rome", "Rabat" } };
		// The Enhanced loop Approach

		for (String[] country : countries) {
			for (String c : country) {
				System.out.print(c + "  ");
			}
			System.out.println();
		}

		System.out.println("*********************************************");
		// The For loop Approach

		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + "  ");
			}
			System.out.println();
		}
	}
}

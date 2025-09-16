package sep16;

public class controlFlowLearn {
	public static void main(String[] args) {
		int number = 15;

		if (number % 2 == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is Odd");
		}

		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Other day");
		}

		System.out.println("\nFor loop:");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i);
		}

		System.out.println("\nWhile loop:");
		int count = 1;
		while (count <= 3) {
			System.out.println("While count: " + count);
			count++;
		}

		System.out.println("\nDo-while loop:");
		int num = 1;
		do {
			System.out.println("Do-while count: " + num);
			num++;
		} while (num <= 2);
	}
}

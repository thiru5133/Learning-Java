package sep16;

public class SampleProg {
	public static int calculateSum(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static int findMax(int[] numbers) {
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] marks = { 85, 92, 76, 88, 95 };

		System.out.println("Marks of Students:");
		for (int mark : marks) {
			System.out.println(mark);
		}

		int total = calculateSum(marks);
		int highest = findMax(marks);

		System.out.println("\nTotal Marks = " + total);
		System.out.println("Highest Mark = " + highest);
	}
}
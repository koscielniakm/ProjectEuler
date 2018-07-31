
public class Problem1 {
	
	public static boolean isMultipleOf(int currentNumber, int potentialMultiple) {
		if (currentNumber % potentialMultiple == 0) return true;
		else return false;
	}
	
	public static int getSumOfMultiples(int minValue, int maxValue, int [] multiples) {
		if (multiples.length != 2) throw new IllegalArgumentException();
		int sum = 0;
		for (int i = minValue; i <= maxValue; i++)
			if (isMultipleOf(i, multiples[0]) || isMultipleOf(i, multiples[1]))
				sum += i;
		return sum;
	}
	
	public static void main(String[] args) {
		int[] multiples = { 3, 5 };
		int solution = getSumOfMultiples(1, 999, multiples);
		System.out.println(solution);
	}
	
}

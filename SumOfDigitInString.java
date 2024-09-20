package java_8;

public class SumOfDigitInString {

	public static void main(String[] args) {
		String str="Roh12i56t";
		int sum=str.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
		System.out.println(sum);
	}
}

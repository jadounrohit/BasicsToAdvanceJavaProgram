package java_8;
import java.util.Arrays;
import java.util.List;
public class Square_Average {

		public static void main(String args[]) {
			List<Integer> list=Arrays.asList(10,20,30,40,50);
			double avg=list.stream().map(e->e*e).mapToInt(e->e).average().getAsDouble();
			System.out.println(avg);
			
			//sum of square arraylist
			int square=list.stream().mapToInt(n->n*n).sum();
			System.out.println(square);
}
}

package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		
		
		System.out.println(nums.stream().reduce((a, b) -> Math.max(a, b)).get());
		System.out.println(nums.stream().reduce((a, b) -> Math.min(a, b)).get());
		System.out.println(nums.stream().filter(x -> x%2 == 0).collect(Collectors.toList()));
		System.out.println(nums.stream().filter(x -> x%2 == 1).collect(Collectors.toList()));
		System.out.println(nums.stream().reduce((a, b) -> a+b).get());
		System.out.println(nums.stream().map(x -> x * x).filter(x -> x%2 == 1).reduce((a,b) -> Math.min(a, b)).get());
		
	}

}

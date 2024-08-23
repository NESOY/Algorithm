package Programmers;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class 데모테스트1Test {
	private 데모테스트1 solution;

	@BeforeEach
	public void setUp() throws Exception {
		solution = new 데모테스트1();
	}

	@Test
	public void solution() {
		int[][] array = {{1, 4}, {3, 4}, {3, 10}};
		int[] ans = {1, 10};

		int[] result = solution.solution(array);
		System.out.println(Arrays.toString(result));
		assertTrue(Arrays.equals(result, ans));
	}
}
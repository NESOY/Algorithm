package Programmers;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class 데모테스트1Test {
	private 데모테스트1 solution;

	@Before
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
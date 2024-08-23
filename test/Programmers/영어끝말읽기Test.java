package Programmers;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class 영어끝말읽기Test {
	private 영어끝말읽기 solution;

	@BeforeEach
	public void setUp() {
		solution = new 영어끝말읽기();
	}


	@Test
	public void getLastChar() {
		char result = solution.getLastChar("Nesoy");
		assert result == 'y';
	}

	@Test
	public void getFirstChar() {
		char result = solution.getFirstChar("Nesoy");
		assert result == 'N';
	}

	@Test
	public void solution() {
		String[] arrray = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] ans = {1, 3};
		int[] result = solution.solution(2, arrray);

		assertTrue(Arrays.equals(ans, result));
	}
}
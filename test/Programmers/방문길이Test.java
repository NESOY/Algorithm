package Programmers;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class 방문길이Test {
	private 방문길이 solution;

	@Before
	public void setUp() {
		solution = new 방문길이();
	}


	@Test
	public void solution() {
		int result = solution.solution("ULURRDLLU");
		assert result == 7;
	}

	@Test
	public void solution2() {
		int result = solution.solution("LULLLLLLU");
		assert result == 7;
	}


	@Test
	public void getPosition() {
		int[] array = {0, 0};
		int[] ans = {0, 1};

		int[] result = solution.getPosition('U', array);

		assertTrue(Arrays.equals(ans, result));
	}

	@Test
	public void getPosition_down() {
		int[] array = {0, 0};
		int[] ans = {0, -1};

		int[] result = solution.getPosition('D', array);

		assertTrue(Arrays.equals(ans, result));
	}
}
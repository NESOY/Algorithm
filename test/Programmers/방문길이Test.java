package Programmers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 방문길이Test {
	private 방문길이 solution;

	@BeforeEach
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
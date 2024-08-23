package Codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test_FrogJmp {
	private FrogJmp solution;

	@BeforeEach
	public void setUp(){
		solution = new FrogJmp();
	}

	@Test
	public void example(){
		int result = solution.solution(10, 85, 30);

		assertEquals(3, result);
	}

	@Test
	public void example2(){
		int result = solution.solution(10, 10, 30);

		assertEquals(0, result);
	}

	@Test
	public void example3(){
		int result = solution.solution(0, 30, 30);

		assertEquals(1, result);
	}

	@Test
	public void example4(){
		int result = solution.solution(1, 1000000000, 1000000000);

		assertEquals(1, result);
	}

	@Test
	public void example5(){
		int result = solution.solution(1, 1000000000, 1);

		assertEquals(1000000000-1, result);
	}

	@Test
	public void example6(){
		int result = solution.solution(1, 2, 1000000000);

		assertEquals(1, result);
	}
}

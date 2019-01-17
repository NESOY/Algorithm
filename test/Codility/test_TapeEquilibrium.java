package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_TapeEquilibrium {
	private TapeEquilibrium solution;
	@Before
	public void setUp(){
		solution = new TapeEquilibrium();
	}

	@Test
	public void example(){
		int[] A = {3,1,2,4,3};
		int result = solution.solution(A);
		assertEquals(1, result);
	}

	@Test
	public void example3(){
		int[] A = {0, 0};
		int result = solution.solution(A);
		assertEquals(0, result);
	}

	@Test
	public void example4(){
		int[] A = {1000, 0};
		int result = solution.solution(A);
		assertEquals(1000, result);
	}

	@Test
	public void example5(){
		int[] A = {3, -1};
		int result = solution.solution(A);
		assertEquals(4, result);
	}

	@Test
	public void example6(){
		int[] A = {-4, -1};
		int result = solution.solution(A);
		assertEquals(3, result);
	}

	@Test
	public void example7(){
		int[] A = {0, -1000};
		int result = solution.solution(A);
		assertEquals(1000, result);
	}

	@Test
	public void example8(){
		int[] A = {4, -4, -8, 8};
		int result = solution.solution(A);
		assertEquals(0, result);
	}

	@Test
	public void example9(){
		int[] A = {1000, -1000};
		int result = solution.solution(A);
		assertEquals(2000, result);
	}
}

package Codility;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_CyclicRotation {
	private CyclicRotation solution;
	@Before
	public void setUp(){
		solution = new CyclicRotation();
	}

	@Test
	public void example(){
		int[] A = {3, 8, 9, 7, 6};
		int[] ans = {9, 7, 6, 3, 8};

		int[] result = solution.solution(A, 3);

		assertTrue(Arrays.equals(result, ans));
	}

	@Test
	public void example2(){
		int[] A = {0,0,0};
		int[] ans = {0,0,0};

		int[] result = solution.solution(A, 3);

		assertTrue(Arrays.equals(result, ans));
	}

	@Test
	public void example3(){
		int[] A = {1, 2, 3, 4};
		int[] ans = {1, 2, 3, 4};

		int[] result = solution.solution(A, 4);

		assertTrue(Arrays.equals(result, ans));
	}

	@Test
	public void example4(){
		int[] A = {1, 2, 3, 4};
		int[] ans = {1, 2, 3, 4};

		int[] result = solution.solution(A, 100);

		assertTrue(Arrays.equals(result, ans));
	}

	@Test
	public void example5(){
		int[] A = {1, 2, 3, 4};
		int[] ans = {1, 2, 3, 4};

		int[] result = solution.solution(A, 0);

		assertTrue(Arrays.equals(result, ans));
	}

	@Test
	public void example6(){
		int[] A = {};
		int[] ans = {};

		int[] result = solution.solution(A, 0);

		assertTrue(Arrays.equals(result, ans));
	}
}

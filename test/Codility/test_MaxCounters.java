package Codility;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test_MaxCounters {
	private MaxCounters solution;

	@Before
	public void setUp(){
		solution = new MaxCounters();
	}

	@Test
	public void example(){
		int[] A = {3,4,4,6,1,4,4};
		int N = 5;
		int[] ans = {3,2,2,4,2};

		int[] result = solution.solution(N, A);

		assertTrue(Arrays.equals(ans, result));
	}

	@Test
	public void example10(){
		int[] A = {4,4,4,6,4,4,6};
		int N = 5;
		int[] ans = {5,5,5,5,5};

		int[] result = solution.solution(N, A);

		assertTrue(Arrays.equals(ans, result));
	}

	@Test
	public void example2(){
		int[] A = {100001,6,6,6,6,6,6};
		int N = 100000;

		int[] result = solution.solution(N, A);

		assertEquals(6, result[5]);
	}

	@Test
	public void example3(){
		int[] A = {6,6,6,6,6,6,100001};
		int N = 100000;

		int[] result = solution.solution(N, A);

		assertEquals(6, result[N-1]);
	}

	@Test
	public void worst_case(){
		int[] A = {1,6,1,6,1,6};
		int N = 5;

		int[] result = solution.solution(N, A);

		assertEquals(3, result[N-1]);
	}
}

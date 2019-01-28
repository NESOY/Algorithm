package Codility;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_MissingInteger {
	private MissingInteger solution;

	@Before
	public void setUp(){
		solution = new MissingInteger();
	}
	@Test
	public void example(){
		int[] A = {1,3,6,4,1,2};
		int result = solution.solution(A);
		assertEquals(5, result);
	}
	@Test
	public void example2(){
		int[] A = {3,2,1};
		int result = solution.solution(A);
		assertEquals(4, result);
	}

	@Test
	public void example3(){
		int[] A = {1,2,3};
		int result = solution.solution(A);
		assertEquals(4, result);
	}

	@Test
	public void example4(){
		int[] A = {-1,-2,-3};
		int result = solution.solution(A);
		assertEquals(1, result);
	}

	@Test
	public void example5(){
		int[] A = new int[100000];
		IntStream.rangeClosed(0,99999).forEach(index -> A[index] = index+1);
		int result = solution.solution(A);
		assertEquals(100001, result);
	}

	@Test
	public void example6(){
		int[] A = {0};
		int result = solution.solution(A);
		assertEquals(1, result);
	}
}

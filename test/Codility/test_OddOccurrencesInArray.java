package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_OddOccurrencesInArray {
	private OddOccurrencesInArray solution;
	@Before
	public void setUp(){
		solution = new OddOccurrencesInArray();
	}

	@Test
	public void exampleTest(){
		int[] A = {9,3,9,3,9,7,9};

		int result = solution.solution(A);

		assertEquals(7, result);
	}

	@Test
	public void exampleTest2(){
		int[] A = {9};

		int result = solution.solution(A);

		assertEquals(9, result);
	}

	@Test
	public void exampleTest3(){
		int[] A = {9,9,7};

		int result = solution.solution(A);

		assertEquals(7, result);
	}

	@Test
	public void exampleTest4(){
		int[] A = {7,9,7};

		int result = solution.solution(A);

		assertEquals(9, result);
	}

	@Test
	public void exampleTest5(){
		int[] A = {7,9,9};

		int result = solution.solution(A);

		assertEquals(7, result);
	}

	@Test
	public void exampleTest6(){
		int[] A = {7,7,7,9,9};

		int result = solution.solution(A);

		assertEquals(7, result);
	}

	@Test
	public void exampleTest7(){
		int[] A = {7,7,9,9,7};

		int result = solution.solution(A);

		assertEquals(7, result);
	}

	@Test
	public void exampleTest8(){
		int[] A = {7};

		int result = solution.solution(A);

		assertEquals(7, result);
	}
}

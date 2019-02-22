package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_예산 {
	private 예산 solution;
	@Before
	public void setUp(){
		solution = new 예산();
	}

	@Test
	public void test(){
		int[] array = {2,2,3,3};

		int result = solution.solution(array, 10);

		assertEquals(4, result);
	}
	@Test
	public void test2(){
		int[] array = {1,3,2,5,4};

		int result = solution.solution(array, 9);

		assertEquals(3, result);
	}
}

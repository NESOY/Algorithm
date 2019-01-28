package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_FrogRiverOne {
	private FrogRiverOne solution;

	@Before
	public void setUp(){
		solution = new FrogRiverOne();
	}

	@Test
	public void example(){
		int[] A = {1,3,1,4,2,3,5,4};

		int result = solution.solution(5, A);

		assertEquals(6, result);
	}

	@Test
	public void example2(){
		int[] A = {1,3,1,4,2,3,5,6};

		int result = solution.solution(7, A);

		assertEquals(-1, result);
	}
}

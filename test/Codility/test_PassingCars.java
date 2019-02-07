package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_PassingCars {
	private PassingCars solution;
	@Before
	public void setUp(){
		solution = new PassingCars();
	}

	@Test
	public void example(){
		int[] A = {0,1,0,1,1};

		int result = solution.solution(A);

		assertEquals(5, result);
	}
}

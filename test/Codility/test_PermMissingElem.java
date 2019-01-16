package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_PermMissingElem {
	private PermMissingElem solution;
	@Before
	public void setUp(){
		solution = new PermMissingElem();
	}

	@Test
	public void example(){
		int[] A = {2,3,1,5};
		int result = solution.solution(A);
		assertEquals(4, result);
	}
	@Test
	public void example2(){
		int[] A = {2,3,1};
		int result = solution.solution(A);
		assertEquals(4, result);
	}

	@Test
	public void example3(){
		int[] A = {2,3,4};
		int result = solution.solution(A);
		assertEquals(1, result);
	}
}

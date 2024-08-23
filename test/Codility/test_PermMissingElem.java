package Codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test_PermMissingElem {
	private PermMissingElem solution;
	@BeforeEach
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

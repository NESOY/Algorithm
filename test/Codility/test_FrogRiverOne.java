package Codility;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test_FrogRiverOne {
	private FrogRiverOne solution;

	@BeforeEach
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

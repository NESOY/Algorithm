package Codility;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test_PassingCars {
	private PassingCars solution;
	@BeforeEach
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

package Programmers;

import org.junit.Before;
import org.junit.Test;

public class 리모트1Test {
	private 리모트1 solution;

	@Before
	public void setUp() throws Exception {
		solution = new 리모트1();
	}

	@Test
	public void example() {
		solution.getPrime(33);
	}

	@Test
	public void example2() {
		int result = solution.solution(33);
		System.out.println(result);
	}
}
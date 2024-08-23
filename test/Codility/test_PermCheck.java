package Codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class test_PermCheck {
	private PermCheck solution;
	@BeforeEach
	public void setUp(){
		solution = new PermCheck();
	}

	@Test
	public void example(){
		int[] A = {4,1,3,2};

		int result = solution.solution(A);

		assertEquals(1, result);
	}

	@Test
	public void example2(){
		int[] A = {4,1,3};

		int result = solution.solution(A);

		assertEquals(0, result);
	}

	@Test
	public void example3(){ // right edge
		int[] A = {1};

		int result = solution.solution(A);

		assertEquals(1, result);
	}

	@Test
	public void example4() {
		int[] A = { 2, 4, 3 };

		int result = solution.solution(A);

		assertEquals(0, result);
	}

	@Test
	public void example5(){ // left edge
		int[] A = {1000000000};

		int result = solution.solution(A);

		assertEquals(0, result);
	}

	@Test
	public void example6(){ // left edge
		int[] A = {2};

		int result = solution.solution(A);

		assertEquals(0, result);
	}
	@Test
	public void example7(){
		int size = 100000;

		int[] A = new int[size];
		IntStream.range(0, size).forEach(index ->A[index] = index+1);

		int result = solution.solution(A);

		assertEquals(1, result);
	}

	@Test
	public void example8(){
		int[] A = {1,1};

		int result = solution.solution(A);

		assertEquals(0, result);
	}
}

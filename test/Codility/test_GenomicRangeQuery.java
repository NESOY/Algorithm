package Codility;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test_GenomicRangeQuery {
	private GenomicRangeQuery solution;

	@BeforeEach
	public void setUp(){
		solution = new GenomicRangeQuery();
	}

	@Test
	public void example(){
		int[] A = {2,5,0};
		int[] B = {4,5,6};
		int[] ans = {2,4,1};

		int[] result = solution.solution("CAGCCTA", A, B);
		System.out.println(Arrays.toString(result));
		assertTrue(Arrays.equals(ans, result));
	}
	@Test
	public void example2(){
		int[] A = {0};
		int[] B = {0};
		int[] ans = {2};

		int[] result = solution.solution("CC", A, B);

		assertTrue(Arrays.equals(ans, result));
	}
	@Test
	public void example3(){
		int[] A = {0};
		int[] B = {47};
		int[] ans = {3};

		int[] result = solution.solution("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", A, B);

		assertTrue(Arrays.equals(ans, result));
	}
}

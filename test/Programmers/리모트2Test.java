package Programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 리모트2Test {
	private 리모트2 solution;

	@BeforeEach
	public void setUp() throws Exception {
		solution = new 리모트2();
	}

	@Test
	public void example() {
		int[] people = {2, 3};
		int[] tshirts = {1, 2, 3};

		int result = solution.solution(people, tshirts);

		System.out.println(result);
	}

	@Test
	public void example2() {
		int[] people = {1, 2, 3}; // 5000
		int[] tshirts = {2, 3}; // 2

		int result = solution.solution(people, tshirts);

		System.out.println(result);
	}

	@Test
	public void example3() {
		int[] people = {2, 2}; // 5000
		int[] tshirts = {1, 1}; // 2

		int result = solution.solution(people, tshirts);

		System.out.println(result);
	}

	@Test
	public void example4() {
		int[] people = {1, 1}; // 5000
		int[] tshirts = {2, 2}; // 2

		int result = solution.solution(people, tshirts);

		System.out.println(result);
	}

	@Test
	public void example5() {
		int[] people = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 5000
		int[] tshirts = {10, 11, 12, 12, 3123, 12, 123, 123, 123, 2}; // 2

		int result = solution.solution(people, tshirts);

		System.out.println(result);
	}
}
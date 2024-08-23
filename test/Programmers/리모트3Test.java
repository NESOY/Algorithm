package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 리모트3Test {
	private 리모트3 solution;

	@BeforeEach
	public void setUp() throws Exception {
		solution = new 리모트3();
	}

	@Test
	public void solution() {
		int[] health = {200, 120, 150};
		int[][] items = {{30, 100}, {500, 30}, {100, 400}};
//		int[] ans = {1, 2};

		int[] result = solution.solution(health, items);

		System.out.println(Arrays.toString(result));
	}

	@Test
	public void solution5() {
		int[] health = {300, 200, 500};
		int[][] items = {{1000, 600}, {400, 500}, {300, 100}};
//		int[] ans = {1, 2};

		int[] result = solution.solution(health, items);

		System.out.println(Arrays.toString(result));
	}

	@Test
	public void solution6() {
		int[] health = {120};
		int[][] items = {{1000, 10}, {400, 10}};
//		int[] ans = {1, 2};

		int[] result = solution.solution(health, items);

		System.out.println(Arrays.toString(result));
	}

	@Test
	public void solution2() {
		int[] health = {150};
		int[][] items = {{30, 10}, {500, 30}, {100, 400}};
		List<Integer> list = solution.getUseableItems(health, items);
		System.out.println(list);
	}

	@Test
	public void solution3() {
		List<Integer> health = new ArrayList<>();
		health.add(0);
		health.add(1);
		int[][] items = {{30, 10}, {500, 30}, {100, 400}};
		List<Integer> list = solution.sortedMaDamageItemsIndex(health, items);
		System.out.println(list);
	}
}
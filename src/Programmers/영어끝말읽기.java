package Programmers;

import java.util.HashSet;
import java.util.Set;

public class 영어끝말읽기 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		Set<String> wordMap = new HashSet<>();
		int who = 1;
		int cycle = 2;

		char last = words[0].charAt(words[0].length() - 1);
		wordMap.add(words[0]);

		for (int i = 1; i < words.length; i++) {
			String word = words[i];

			if (wordMap.contains(word) || last != getFirstChar(word)) {
				answer[0] = who + 1;
				answer[1] = (int) Math.ceil(cycle / (double) n);
				break;
			}

			cycle++;
			last = getLastChar(word);
			who = (who + 1) % n;
			wordMap.add(word);
		}

		return answer;
	}

	public char getLastChar(String input) {
		int size = input.length();
		return input.toCharArray()[size - 1];
	}

	public char getFirstChar(String input) {
		return input.toCharArray()[0];
	}
}

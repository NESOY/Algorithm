package Programmers;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class 방문길이 {
	public int solution(String dirs) {
		int answer = 0;

		int[] position = {0, 0};
		Set<Position> map = new HashSet<>();

		for (char dir : dirs.toCharArray()) {
			int prevX = position[0];
			int prevY = position[1];
			position = getPosition(dir, position);
			Position object = new Position(position[0], position[1], prevX, prevY);

			if (!map.contains(object)) {
				map.add(object);
				answer++;
			}

		}

		return answer;
	}

	public int[] getPosition(char dir, int[] position) {

		switch (dir) {
			case 'U':
				if (position[1] + 1 <= 5) {
					position[1]++;
				}
				break;
			case 'D':
				if (position[1] - 1 >= -5) {
					position[1]--;
				}
				break;
			case 'R':
				if (position[0] + 1 <= 5) {
					position[0]++;
				}
				break;
			case 'L':
				if (position[0] - 1 >= -5) {
					position[0]--;
				}
				break;
		}
		return position;
	}

	class Position {
		int startX;
		int endX;
		int startY;
		int endY;

		public Position(int startX, int startY, int endX, int endY) {
			this.startX = startX;
			this.startY = startY;
			this.endX = endX;
			this.endY = endY;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Position position = (Position) o;
			return startX == position.startX &&
					endX == position.endX &&
					startY == position.startY &&
					endY == position.endY;
		}

		@Override
		public int hashCode() {
			return Objects.hash(startX, endX, startY, endY);
		}
	}
}

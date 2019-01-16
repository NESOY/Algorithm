package Codility;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		double distance = Y - X;
		if(distance == 0)
			return 0;
		double rate = (distance / (double) D);
		if (Math.floor(rate) == Math.abs(rate)) // 버림, 절대값
			return (int)rate;

		return (int)rate + 1;
	}
}

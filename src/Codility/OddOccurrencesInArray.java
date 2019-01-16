package Codility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class OddOccurrencesInArray {
	// Requirements
	// The array contains an odd number of elements
	// each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
	public int solution(int[] A) {
		Set<Integer> ans = new HashSet<>();
		for(int item : A){
			Integer itemObject = item;
			if(ans.contains(itemObject)){
				ans.remove(itemObject);
			}else{
				// Edge Case : 지속적으로 add하면 HashSet의 충돌현상으로 확장하는데 시간이 소요
				ans.add(itemObject);
			}
		}

		return ans.iterator().next();
	}

	public int solution1(int[] A) {
		Map<Integer, Integer> countInfos = new HashMap<>();

		for(int item : A){
			Optional<Integer> count = Optional.ofNullable(countInfos.get(item));
			int sumOfCount = count.orElse(0) + 1;
			countInfos.put(item, sumOfCount);
		}

		Optional<Integer> key = countInfos.keySet().stream()
				.filter(index -> countInfos.get(index) % 2 != 0)
				.findFirst();

		return key.orElse(-1);
	}
}

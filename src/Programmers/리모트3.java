package Programmers;

import java.util.*;

public class 리모트3 {
	//	아이템 번호는 오름차순으로 정렬해 return 해주세요.
	//	올려주는 공격력이 같은 아이템은 없습니다.
	public int[] solution(int[] healths, int[][] items) {

		Arrays.sort(healths);

		List<Integer> useableItemsIndex = getUseableItems(healths, items);
		List<Integer> maxDamageIndex = sortedMaDamageItemsIndex(useableItemsIndex, items);
		List<Integer> answerIndex = new ArrayList<>();

		for (int health : healths) {
			for (int itemIndex : maxDamageIndex) {
//				int damage = items[itemIndex][0];
				int minusHealth = items[itemIndex][1];
				if (health - minusHealth >= 100) {
					answerIndex.add(itemIndex);
					maxDamageIndex.remove(0);
				}
			}
		}

		return getAnswer(answerIndex);
	}

	public int[] getAnswer(List<Integer> answerList) {
		Collections.sort(answerList);
		int[] answer = new int[answerList.size()];
		int index = 0;
		for (int item : answerList) {
			answer[index] = item + 1;
			index++;
		}

		return answer;
	}

	public List<Integer> getUseableItems(int[] healths, int[][] items) {
		List<Integer> useableItemsIndex = new ArrayList<>();
		int index = 0;

		for (int[] item : items) {
			int minusHealth = item[1];
			for (int health : healths) {
				if (health - minusHealth >= 100) {
					useableItemsIndex.add(index);
					break;
				}
			}
			index++;
		}

		return useableItemsIndex;
	}

	public List<Integer> sortedMaDamageItemsIndex(List<Integer> useableItems, int[][] items) {
		List<Integer> sortedItems = new LinkedList<>();
		while (!useableItems.isEmpty()) {
			int maxDamage = -1;
			int maxIndex = -1;
			for (int index : useableItems) {
				int damage = items[index][0];
				if (Math.max(damage, maxDamage) == damage) {
					maxIndex = index;
					maxDamage = damage;
				}
			}
			sortedItems.add(maxIndex);
			useableItems.remove(Integer.valueOf(maxIndex));
		}
		return sortedItems;
	}
}


//import java.util.*;

class p3 {
	public int[] solution(int[] healths, int[][] items) {
		ArrayList<Item> itemList = new ArrayList<>();
		for (int i = 0; i < items.length; i++)
			itemList.add(new Item(i + 1, items[i][0], items[i][1]));
		Collections.sort(itemList);

		Arrays.sort(healths);
		ArrayList<Integer> answerList = new ArrayList<>();
		boolean[] visit = new boolean[healths.length];
		for (Item item : itemList) {
			for (int i = 0; i < healths.length; i++) {
				if (!visit[i] && (healths[i] - item.health >= 100)) {
					answerList.add(item.id);
					visit[i] = true;
					break;
				}
			}
		}

		int[] answer = new int[answerList.size()];
		Iterator<Integer> it = answerList.iterator();
		for (int i = 0; i < answer.length; i++)
			answer[i] = it.next();

		Arrays.sort(answer);
		return answer;
	}

	class Item implements Comparable<Item> {
		int id;
		int force;
		int health;

		Item(int id, int force, int health) {
			this.id = id;
			this.force = force;
			this.health = health;
		}

		@Override
		public int compareTo(Item target) {
			return this.force <= target.force ? 1 : -1;
		}
	}
}
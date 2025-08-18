import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
		// ❶ 스테이지별 도전자 수를 구함
		int[] challenger = new int[N + 2]; // challenger[6]에 접근할 때, ArrayIndexOutOfBoundsException 방지를 위해, 안전하게 N+2 크기로 선언

		for (int i = 0; i < stages.length; i++) {
			challenger[stages[i]] += 1;
		}

		// ❷ 스테이지별 실패한 사용자 수 계산
		HashMap<Integer, Double> fails = new HashMap<>(); // 스테이지 번호를 key, 실패율을 value
		double total = stages.length; // 처음에는 전체 사용자 수

		// ❸ 각 스테이지를 순회하며, 실패율 계산
		for (int i = 1; i <= N; i++) {
			if (challenger[i] == 0) { // ❹ 도전한 사람이 없는 경우, 실패율은 0
				fails.put(i, 0.);
			}
			else {
				fails.put(i, challenger[i] / total); // ❺ 실패율 구함
				total -= challenger[i]; // ❻ 다음 스테이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
			}
		}

		// ❼ 실패율이 높은 스테이지부터 내림차순으로 정렬
		return fails.entrySet() // 쌍들을 뽑아줍
			.stream()
			// 스트림을 정렬, Double.compare(a, b)는 a와 b를 비교해서 정렬 기준을 정함(내림차순).
			.sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
			.mapToInt(HashMap.Entry::getKey) // key(스테이지 번호)만 추출
			.toArray(); // 최종적으로 int[] 배열로 변환해서 반환.
	}
}
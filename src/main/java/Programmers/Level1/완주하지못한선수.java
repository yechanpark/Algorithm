package Programmers.Level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * <p>
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 입출력 예
 * participant	                            completion	                        return
 * [leo, kiki, eden]	                    [eden, kiki]	                    leo
 * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
 * [mislav, stanko, mislav, ana]	        [stanko, ana, mislav]	            mislav
 * 입출력 예 설명
 * 예제 #1
 * leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * <p>
 * 예제 #2
 * vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * <p>
 * 예제 #3
 * mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
public class 완주하지못한선수 {
    // participant.length -1 = completion.length
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참여자의 수 만큼 루프
        for (int i = 0; i < participant.length; i++) {

            // 참가자 계산, 맵에 있는 경우 (이미 앞에서 나온 경우)
            if (map.containsKey(participant[i])) {

                // 참가자의 명수를 구함
                int count = map.get(participant[i]);

                // 현재까지 확인한, 완료한 참가자의 목록에서 1개라면 맵에서 제외
                if (count == -1) {
                    map.remove(participant[i]);
                }

                // 현재까지 확인한, 완료한 참가자의 목록에서 여러개라면 1회 추가
                else {
                    map.put(participant[i], count + 1);
                }
            }

            // 앞에서 나온 적이 없는 없는 경우 1회 추가
            else {
                map.put(participant[i], 1);
            }


            // 완료한 사람의 수는, 참가자보다 1 적으므로 체크해야 함
            if (i < completion.length) {
                // 참가자 계산, 맵에 있는 경우 (이미 앞에서 나온 경우)
                if (map.containsKey(completion[i])) {

                    // 완료자의 명수를 구함
                    int count = map.get(completion[i]);

                    // 현재까지 확인한, 참가자의 목록에서 1개라면 맵에서 제외
                    if (count == 1) {
                        map.remove(completion[i]);
                    }

                    // 현재까지 확인한, 참가자의 목록에서 여러개라면 1회 감소
                    else {
                        map.put(completion[i], count - 1);
                    }
                }

                // 앞에서 나온 적이 없는 없는 경우 1회 감소
                else {
                    map.put(completion[i], -1);
                }
            }
        }

        // 최종 적으로 맵에는 단 한 명의 참가자 만이 존재 (완주하지 못해 카운트 값을 0으로 만들지 못함)
        for (String str : map.keySet()) {
            return str;
        }

        return "";
    }
}

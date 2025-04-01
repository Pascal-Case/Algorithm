import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 임시Map
        Map<String,Integer> tmpMap = new HashMap<>();
        // 결과Map
        Map<String,Integer> resultMap = new HashMap<>();
        // 입출차 레코드 분리해서, inout시간 구하기 
        for(String input : records){
            // 입출차 레코드 분리
            String[] str = input.split(" ");
            String[] tmp = str[0].split(":");
            int hour = Integer.parseInt(tmp[0]);
            int minute = hour*60+Integer.parseInt(tmp[1]);
            String number = str[1];
            String inout = str[2];
            // IN이면 임시Map에 입차시간 넣기 
            if("IN".equals(inout)){
                tmpMap.put(number,minute);
            // OUT이면 결과Map에 누적시간(출차-입차시간) 넣기 
            // 임시Map 제거
            }else{
                int ominute = minute-tmpMap.get(number);
                resultMap.put(number, resultMap.getOrDefault(number,0)+ominute);
                tmpMap.remove(number);
            }
        }
        // IN만 있고, OUT이 없는 경우, 23:59분에서 IN시간을 빼준다.
        // 다시 결과Map에 누적시간 더하기 
        if(!tmpMap.isEmpty()){
            for(String key : tmpMap.keySet()){
                int minute = 24*60-1;
                int ominute = minute-tmpMap.get(key);
                resultMap.put(key, resultMap.getOrDefault(key,0)+ominute);
            }
        }

        // 결과Map의 key(번호판) 리스트 만들어서 오름차순 정렬 
        List<String> list = new ArrayList<>(resultMap.keySet());
        Collections.sort(list);
        // 정답 리스트
        List<Integer> answer = new ArrayList<>();
        // 각 번호판별 누적시간을 불러와서 요금 구하기 
        for(String key : list){
            int sum = calculator(fees, resultMap.get(key)); // 요금 구하기
            answer.add(sum);
        }
        // 정답 리스트를 배열로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 요금 구하기 
    public int calculator(int[] fees, int minute){
        // 요금 레코드 분리
        int bTime = fees[0];
        int bFee = fees[1];
        double uTime = Double.valueOf(fees[2]); //나누기 해야되서 double로 
        int uFee = fees[3];
        int sum = 0;
        // 누적시간이 기본시간 이내이면
        if(bTime>minute){
            sum = bFee; // 기본 요금만 받는다 
        // 누적시간이 기본시간보다 크면 
        }else{
            // 기본요금 + (int)[(올림)((누적시간-기본시간)/(double)단위시간)] * 단위요금
            sum = bFee+(int)Math.ceil((minute-bTime)/uTime)*uFee;
        }
        return sum;
    }
}
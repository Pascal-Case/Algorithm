import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(String city : cities) {
            city = city.toLowerCase();
            if(list.contains(city)) {
                // System.out.println(city);
                int count = 0;
                int n = queue.size();
                while(count < n) {
                    String c = queue.poll();
                    if(!c.equals(city)) {
                        queue.add(c);
                    }
                    count++;
                }
                
                queue.add(city);
                answer++;
            } else { // 캐시에 없음
                
                // 캐시가 가득 찼을때는 LRU 실행
                if(list.size() == cacheSize) {
                    String remove = queue.poll();
                    list.remove(remove);
                }
                
                list.add(city);
                queue.add(city);
                answer += 5;
            }
        }
        
        return answer;
    }
}
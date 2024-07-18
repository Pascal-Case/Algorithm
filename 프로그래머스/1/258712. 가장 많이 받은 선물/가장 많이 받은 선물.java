import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int len = friends.length;
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        boolean[][] visited = new boolean[len][len];
        
        HashMap<String, Integer> giftPoints = new HashMap<>();
        
        HashMap<String, Integer> giftCount = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            map.put(friends[i], new HashMap<>());
            giftCount.put(friends[i], 0);
            giftPoints.put(friends[i], 0);
            visited[i][i] = true;
        }
    
        
        for(String gift : gifts) {
            String from = gift.split(" ")[0];
            String to = gift.split(" ")[1];
            
            HashMap<String, Integer> giftMap = map.get(from);
            giftMap.put(to, giftMap.getOrDefault(to, 0) + 1);
            
            giftPoints.put(from, giftPoints.get(from) + 1);
            giftPoints.put(to, giftPoints.get(to) - 1);
        }
        
        for(int i = 0; i < len; i++) {
            String myName = friends[i];
            HashMap<String, Integer> myGiftMap = map.get(myName);
            
            for(int j = 0; j < len; j++) {
                if(visited[i][j]) continue;
                
                visited[i][j] = true;
                visited[j][i] = true;
                
                String friendName = friends[j];
                HashMap<String, Integer> friendGiftMap = map.get(friendName);
                
                int myGiftCount = myGiftMap.getOrDefault(friendName, 0);
                int friendGiftCount = friendGiftMap.getOrDefault(myName, 0);
                
                if(myGiftCount == friendGiftCount) {
                    int myGiftPoint = giftPoints.get(myName);
                    int friendGiftPoint = giftPoints.get(friendName);
                    
                    if(myGiftPoint > friendGiftPoint) {
                        giftCount.put(myName, giftCount.get(myName) + 1);
                    } else if(myGiftPoint < friendGiftPoint) {
                        giftCount.put(friendName, giftCount.get(friendName) + 1);
                    }
                } else {
                    if(myGiftCount > friendGiftCount) {
                        giftCount.put(myName, giftCount.get(myName) + 1);
                    } else {
                        giftCount.put(friendName, giftCount.get(friendName) + 1);
                    }
                }
            }
        }
        
        int answer = Integer.MIN_VALUE;
        
        System.out.println(map);
        System.out.println(giftPoints);
        System.out.println(giftCount);
        
        for(Entry<String, Integer> entry : giftCount.entrySet()) {
            answer = Math.max(entry.getValue(), answer);
        }
      
        
        return answer;
    }
}
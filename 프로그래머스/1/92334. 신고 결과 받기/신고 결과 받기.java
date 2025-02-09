import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Set<String>> reportedBy = new HashMap<>(); // 나를 신고한 사람
        HashMap<String, Set<String>> reportList = new HashMap<>(); // 내가 신고한 사람
  
        for(String id : id_list) {
            reportList.put(id, new HashSet<>());
            reportedBy.put(id, new HashSet<>());
        }
        
        for(String r : report) {
            String[] arr = r.split(" ");
            String reporter = arr[0]; // 신고한 사람
            String reported = arr[1]; // 신고 당한 사람
            reportList.get(reporter).add(reported);
            reportedBy.get(reported).add(reporter);
        }
        
        // 아이디 순회하며 신고 횟수 배열 완성
        for(int i = 0; i < id_list.length; i++) {
            int cnt = 0;
            String id = id_list[i];
            
            Set<String> set = reportList.get(id);
            Iterator<String> iterator = set.iterator();
            
            while(iterator.hasNext()) {
                String reported = iterator.next();
                if(reportedBy.get(reported).size() >= k) cnt++;
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}
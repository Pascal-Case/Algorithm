class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] skillArr = skill.split("");
        
        for(String s : skill_trees) {
            if(check(skill, s)) answer++;
        }
        return answer;
    }
    
    public static boolean check(String skill, String tree) {
        boolean flag = true;
        String w = "";
        for(String s : tree.split("")) {
            if(skill.contains(s)) w += s;
        }
        
        if(skill.indexOf(w) != 0) flag = false;
        
        return flag;
    }
}

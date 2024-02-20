class Solution {
    public String[] solution(String[] names) {
        int ceil = 0;
        if ((names.length%5)>0)ceil=1;
        String[] answer = new String[names.length/5+ceil];
        int idx=0;
        for(int i=0; i<names.length; i+=5){
            answer[idx++]=names[i];
        }
        return answer;
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        int st=0;
        int end=str.length-1;
        while(st<end){
            String temp=str[st];
            str[st]=str[end];
            str[end]=temp;
            st++;
            end--;
        }
    ;
        return String.join(" ",str);
    }
}
class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char[] n=s.toCharArray();
        while(start<end){
            if(isvowel(n[start]) && isvowel(n[end])){
                char temp=n[start];
                n[start]=n[end];
                n[end]=temp;
                start++;
                end--;
            }
            else if(isvowel(n[start]) && !isvowel(n[end])){
                end--;
            }
            else if(!isvowel(n[start]) && isvowel(n[end])){
                start++;
            }
            else{
                start++;
                end--;
            }

        }
        return new String(n);
    }
    private boolean isvowel(char c){
        return c=='a'||c=='A'||c=='e'||c=='E'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u';
    }
}
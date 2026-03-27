import java.lang.StringBuilder;
import java.lang.String;
class Solution{
    public static String waveform(String input){
        int n=input.length();
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==0){
                str1.append(input.charAt(i));
            }
            else{
                str2.append(input.charAt(i));
            }
        }
        str1.append(str2);
        return str1.toString();
    }
}

class Waveform{
    public static void main(String[] args) {
        /*Solution s=new Solution();
        String n=s.waveform("viratkolhi");*/
        String n=Solution.waveform("viratkolhi");
        System.out.println(n);
    }
}
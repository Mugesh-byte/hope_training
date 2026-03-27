
public class Evenlength{
    static String[] splitt(String str){
        int o=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                o++;
            }
        }
        String[] sarr=new String[o];
        int m=0;
        StringBuilder n=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                n.append(str.charAt(i));
            }
            else{
                sarr[m]=n.toString();
                n.setLength(0);
                m+=1;

            }
            if(i==str.length()-1){
                sarr[m]=n.toString();
            }

        }
        return sarr;
        
    }
    public static void main(String[] args){
        String str="with even length";
        String[] sarr=splitt(str);
        int k=0;
        for(int i=0;i<sarr.length;i++){
            System.out.println(sarr[i]);
            if(sarr[i]==null) continue;
            if(sarr[i].length()%2==0){
                k+=1;
            }
        }
        System.out.println(k);

    }
}
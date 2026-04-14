import java.util.*;
public class Sort{
    public List<Character> sortbyfreq(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.chatAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b){
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue()-a.getValue();
                }
                return a.getKey()-b.getKey();
            }
        });

        List<Character> result=new ArrayList<>();
        for(Map.Entry<Character,Integer> i:list){
            result.add(i.getKey());
        }
        return result;
    
}
public class InnerSort{
    public static void main(String[] args) {
        

    }
}